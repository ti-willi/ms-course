package com.tiwilli.hruser.dto;

import com.tiwilli.hruser.entities.User;

import java.util.HashSet;
import java.util.Set;

public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String password;

    private Set<RoleDTO> roles = new HashSet<>();

    public UserDTO(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public UserDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        password = entity.getPassword();
        entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }
}
