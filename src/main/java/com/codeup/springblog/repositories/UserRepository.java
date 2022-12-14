package com.codeup.springblog.repositories;

import com.codeup.springblog.modals.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getById(long id);
    User findByUsername(String username);
}
