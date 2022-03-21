package org.acaps.controlmanagement.users;

import lombok.RequiredArgsConstructor;
import org.acaps.controlmanagement.constant.UserImplConstant;
import org.acaps.controlmanagement.exception.EmailExistException;
import org.acaps.controlmanagement.exception.UserNotFoundException;
import org.acaps.controlmanagement.security.UserPrincipal;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserDAO userDAO;
    private final BCryptPasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

   public User findAccountByEmailIgnoreCase(String email){
        return this.userDAO.findUserByEmailIgnoreCase(email);
   }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDTO userDTO = this.userMapper.toDTO(this.userDAO.findUserByEmailIgnoreCase(username));
        if (userDTO == null) {
            throw new UsernameNotFoundException(UserImplConstant.NO_USER_FOUND_BY_USERNAME + username);
        } else {
            return new UserPrincipal(userDTO);
        }
    }


    private String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }

    private void validateNewEmail(String currentEmail, String newEmail) throws UserNotFoundException, EmailExistException {
        User accountByNewEmail = this.userDAO.findUserByEmailIgnoreCase(newEmail);
        if (StringUtils.isNotBlank(currentEmail)) {
            User accountByCurrentEmail = this.userDAO.findUserByEmailIgnoreCase(currentEmail);
            if (accountByCurrentEmail == null) {
                throw new UserNotFoundException(UserImplConstant.NO_USER_FOUND_BY_USERNAME + "  "+ currentEmail);
            }
            if (accountByNewEmail != null && !accountByCurrentEmail.getIdentifiant().equals(accountByNewEmail.getIdentifiant())) {
                throw new EmailExistException(UserImplConstant.EMAIL_ALREADY_EXISTS + "   "+ newEmail);
            }
        } else {
            if (accountByNewEmail != null) {
                throw new EmailExistException(UserImplConstant.EMAIL_ALREADY_EXISTS + "  "+ newEmail);
            }
        }
    }
}
