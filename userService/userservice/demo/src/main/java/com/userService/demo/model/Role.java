package com.userService.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "ROLES")
@Setter
@Getter
public class Role extends BaseModel{
    @Column(name = "name", unique = true)
    private String name;
}
