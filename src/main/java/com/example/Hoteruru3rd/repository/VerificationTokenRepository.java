package com.example.Hoteruru3rd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hoteruru3rd.entity.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository< VerificationToken, Integer> {
public VerificationToken findByToken(String token);
}