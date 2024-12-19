package com.example.demo.controller;

import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/users/")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @Deprecated(forRemoval = true)
    @GetMapping("/{id}")
    public ResponseEntity<?> getUsers(@PathVariable Long id) {
        log.info("Requested url: /api/v1/users/{id}, id = {}, {}, {}",  id, "1", 40, new Date());
        return ResponseEntity.ok(userService.getUser(id));
    }
}
