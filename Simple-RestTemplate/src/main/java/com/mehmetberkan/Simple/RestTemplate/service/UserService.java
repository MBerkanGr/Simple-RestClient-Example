package com.mehmetberkan.Simple.RestTemplate.service;

import com.mehmetberkan.Simple.RestTemplate.dto.UserDTO;
import com.mehmetberkan.Simple.RestTemplate.exception.UserNotFoundException;
import com.mehmetberkan.Simple.RestTemplate.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    private final RestTemplate restTemplate;

    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserDTO getRandomUser() {
        User response = this.restTemplate.getForObject("/users/random_user", User.class);
        if (response == null) {
            throw new UserNotFoundException("User not found");
        }

        return new UserDTO(response.getFirstName(), response.getLastName(), response.getEmail());
    }
}
