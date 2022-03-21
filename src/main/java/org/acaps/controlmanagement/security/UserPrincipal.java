package org.acaps.controlmanagement.security;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.acaps.controlmanagement.users.UserDTO;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@AllArgsConstructor @NoArgsConstructor
public class UserPrincipal implements UserDetails {

    private UserDTO userDTO;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
         List<GrantedAuthority> authorities = new ArrayList<>();
          /*this.accountDTO.getRoleDTO().getPermissions().forEach(p-> {
          GrantedAuthority authority = new
          SimpleGrantedAuthority(p.getPermissionName()); authorities.add(authority);
          });*/
        return authorities;
    }

    @Override
    public String getPassword() {
        return this.userDTO.getMotdepasse();
    }

    @Override
    public String getUsername() {
        return this.userDTO.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.userDTO.isNotLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.userDTO.isActive();
    }
}
