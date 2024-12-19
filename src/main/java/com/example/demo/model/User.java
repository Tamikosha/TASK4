package com.example.demo.model;

import jakarta.persistence.Column;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class User {

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_age")
    private Integer userAge;
    @CreationTimestamp
    @Column(name = "created_at",updatable = false)
    private LocalDateTime createdAt;
}
