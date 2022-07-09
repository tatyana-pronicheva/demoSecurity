package ru.gb.demoSecurity.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.demoSecurity.repositories.UserRepository;

import java.security.Principal;

@RequiredArgsConstructor
@RestController
public class SimpleController {
    private UserRepository userRepository;

    @GetMapping("/")
    public String homePage(){
        return "home";
    }

    @GetMapping("/unsecured")
    public String usecuredPage() {
        return "unsecured";
    }

    @GetMapping("/auth_page")
    public String authenticatedPage() {
        return "authenticated";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }

    @GetMapping("/user_info")
    public String daoTestPage(Principal principal) {
        return "Authenticated user info: " + principal.getName();
    }
}