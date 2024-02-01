package com.example.usermanagement.Repository;

import com.example.usermanagement.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
