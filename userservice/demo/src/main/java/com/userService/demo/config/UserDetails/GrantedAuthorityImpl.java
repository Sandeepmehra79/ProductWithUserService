package com.userService.demo.config.UserDetails;

import com.userService.demo.model.Role;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class GrantedAuthorityImpl implements GrantedAuthority {
    private Role role;

    public GrantedAuthorityImpl(Role role) {
        this.role = role;
    }
    @Override
    public String getAuthority() {
        return role.getName();
    }
}
