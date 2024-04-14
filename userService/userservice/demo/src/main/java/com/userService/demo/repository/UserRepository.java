package com.userService.demo.repository;

import com.userService.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {
    public User save(User user);
    public Optional<User> findById(Long id);

    public Optional<User> findByEmail (String email);

    public List<User> findAll();

    public Optional<User> findByUsername(String username);

    void deleteByUsername(String username);

    Optional<User> getUserByEmail(String email);

    Optional<User> getUserById(Long userId);
}
