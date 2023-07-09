package com.example.logindandregistration.repositories;

import com.example.logindandregistration.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
