package com.example.demo.service;

import com.example.demo.exception.LibraryException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getUser(Long id) {
        try {
            if (id == 4){
                log.warn("Logged in VIP or Admin");
            }
            return userRepository.findById(id)
                    .orElseThrow(() -> new LibraryException("User not found".formatted(id)));
        }    catch (Exception e) {
            log.error("error while saving user", e);
            throw new LibraryException("User not found".formatted(id), e);
        }
    }
}
