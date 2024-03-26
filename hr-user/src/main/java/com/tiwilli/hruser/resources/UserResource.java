package com.tiwilli.hruser.resources;

import com.tiwilli.hruser.dto.UserDTO;
import com.tiwilli.hruser.entities.User;
import com.tiwilli.hruser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        UserDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<UserDTO> findByEmail(@RequestParam String email) {
        UserDTO dto = service.findByEmail(email);
        return ResponseEntity.ok(dto);
    }

}
