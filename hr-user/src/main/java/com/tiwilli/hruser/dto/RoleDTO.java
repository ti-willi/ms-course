package com.tiwilli.hruser.dto;

import com.tiwilli.hruser.entities.Role;

public class RoleDTO {

    private Long id;
    private String name;

    public RoleDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public RoleDTO(Role entity) {
        id = entity.getId();
        name = entity.getRoleName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
