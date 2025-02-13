package com.ruvalcaba.users_login.repository;

import com.ruvalcaba.users_login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
