package org.acaps.controlmanagement.users;

import lombok.RequiredArgsConstructor;
import org.acaps.controlmanagement.security.JWTTokenProvider;
import org.acaps.controlmanagement.security.SecurityConstant;
import org.acaps.controlmanagement.security.UserPrincipal;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class UserResource {


    private final AuthenticationManager authenticationManager;
    private final JWTTokenProvider jwtTokenProvider;
    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping("login")
    public ResponseEntity<UserDTO> login(@RequestBody User user) {
        authenticate(user.getEmail(), user.getMotdepasse());
        UserDTO loginUser = this.userMapper.toDTO(this.userService.findAccountByEmailIgnoreCase(user.getEmail()));
        UserPrincipal userPrincipal = new UserPrincipal(loginUser);
        HttpHeaders jwtHeader = getJwtHeader(userPrincipal);
        return new ResponseEntity<>(loginUser, jwtHeader, HttpStatus.OK);
    }
   private void authenticate(String username, String password) {
       System.out.println(username);
       System.out.println(password);
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
    }
    private HttpHeaders getJwtHeader(UserPrincipal user) {
        HttpHeaders headers = new HttpHeaders();
        headers.add(SecurityConstant.JWT_TOKEN_HEADER, jwtTokenProvider.generateJwtToken(user));
        return headers;
    }
}
