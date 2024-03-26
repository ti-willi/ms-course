package com.tiwilli.oauth.services;

import com.tiwilli.oauth.dto.UserDTO;
import com.tiwilli.oauth.feignclients.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserFeignClient userFeignClient;

    public UserDTO findByEmail(String email) {
        UserDTO user = userFeignClient.findByEmail(email).getBody();
        if (user == null) {
            logger.error("Email not found " + email);
            throw new IllegalArgumentException("Email not found");
        }
        logger.info("Email: " + email);
        return user;
    }
}
