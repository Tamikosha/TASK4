package com.example.demo.service;

import com.example.demo.controller.UserController;
import com.example.demo.exception.LibraryException;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @Mock
    private UserRepository userRepository;

//    @Test
//    void getUser() {
//        when(userRepository.findById(any()).orElseThrow());
//        assertThrows(LibraryException.class, )
//    }
}