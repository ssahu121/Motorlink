
package com.motorlink.motorlink_backend.service;

import com.motorlink.motorlink_backend.entity.User;
import com.motorlink.motorlink_backend.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User registerUser(User user) {

        // Check whether the email is already registered
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException(
                    "Email is already registered"
            );
        }

        // Save the new user
        return userRepository.save(user);
    }
}
