package ru.netology.authorizationservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.netology.authorizationservice.Authorities;
import ru.netology.authorizationservice.AuthorizationService;
import ru.netology.authorizationservice.InvalidCredentials;
import ru.netology.authorizationservice.UnauthorizedUser;

import java.util.List;

@RestController
@RequestMapping("/")
public class AuthorizationController {
    private AuthorizationService service;

    public AuthorizationController(AuthorizationService service){
        this.service = service;
    }

    @GetMapping("authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        //service = new AuthorizationService();
        return service.getAuthorities(user, password);
    }



}