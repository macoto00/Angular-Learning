package com.example.logindandregistration.repositories;

import com.example.logindandregistration.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
