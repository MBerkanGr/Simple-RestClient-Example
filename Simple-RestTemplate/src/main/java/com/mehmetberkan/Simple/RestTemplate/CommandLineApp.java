package com.mehmetberkan.Simple.RestTemplate;

import com.mehmetberkan.Simple.RestTemplate.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineApp implements CommandLineRunner {

    private final UserService userService;

    public CommandLineApp(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        this.userService.getRandomUser();
    }
}
