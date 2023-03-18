package com.focus.backend.config;

import com.focus.backend.models.User;
import com.focus.backend.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BackendConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return args -> {
            User user = new User("João", "jp@gmail.com");
            User user2 = new User("Maria", "Maria@gmail.com");
            userRepository.saveAll(Arrays.asList(user, user2));
        };
    }
}
