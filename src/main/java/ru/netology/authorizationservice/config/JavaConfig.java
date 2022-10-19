package ru.netology.authorizationservice.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.authorizationservice.AuthorizationService;
import ru.netology.authorizationservice.UserRepository;

@Configuration
public class JavaConfig {

    @Bean
    public AuthorizationService authorizationService(UserRepository userRepository){
        return new AuthorizationService(userRepository);
    }

    @Bean
    public UserRepository userRepository(){
        return new UserRepository();
    }

}

