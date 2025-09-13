package org.amazon.example;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private final Map<String, User> users = new HashMap<>();
    private final PasswordEncoder passwordEncoder;

    public UserService(PasswordEncoder passwordEncoder) {

        this.passwordEncoder = passwordEncoder;
        User admin = new User("admin","admin123","ADMIN");
        registerUser(admin);

        User defaultUser = new User("user","user123","USER");
        registerUser(defaultUser);
    }

    public void registerUser(User user) {
        // Encode the password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        users.put(user.getUsername(), user);  // Store the user in the map
    }

    public User findByUsername(String username) {
        return users.get(username);
    }
}
