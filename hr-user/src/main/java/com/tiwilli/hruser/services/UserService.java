package com.tiwilli.hruser.services;

import com.tiwilli.hruser.dto.UserDTO;
import com.tiwilli.hruser.entities.User;
import com.tiwilli.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        User obj = repository.findById(id).get();
        return new UserDTO(obj);
    }

    @Transactional(readOnly = true)
    public User findByEmail(String email) {
        return repository.findByEmail(email);
    }
}
