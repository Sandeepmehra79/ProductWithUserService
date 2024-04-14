package com.userService.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Entity(name = "USER")
@Getter
@Setter
@Component
public class User extends BaseModel{
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "username", unique = true, columnDefinition = "varchar(255)")
    private String username;
    @Column(name = "password", unique = false, columnDefinition = "varchar(255)")
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @Column(name = "roles")
    private Set<Role> roles;
}
