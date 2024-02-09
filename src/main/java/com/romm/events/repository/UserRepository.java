package com.romm.events.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.romm.events.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    UserDetails findByUsername(String username);
}
