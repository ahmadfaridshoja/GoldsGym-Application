package com.example.GoldGym.repositories;

import com.example.GoldGym.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
