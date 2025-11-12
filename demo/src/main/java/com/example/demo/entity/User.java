package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.security.AuthProvider;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private EAuthProvider provider; // LOCAL or GOOGLE

    private String role; // ROLE_USER / ROLE_ADMIN
}
