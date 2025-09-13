package com.example.ecommerce;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

//TODO 24: In src/main/java/com/example/ecommerce, create a new class called UserService.
//TODO 25: Annotate UserService with @Service.
@Service
public class UserService {
    //TODO 26: Inject UserRepository and PasswordEncoder into UserService.
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    //TODO 27: Add a method initializeUsers() to UserService with @PostConstruct annotation, creating default users:
    //    admin with role ADMIN and password admin123
    //    user with role USER and password user123

    @PostConstruct
    public void initializeUsers() {
        if (userRepository.findByUsername("admin") == null) {
            Users admin = new Users();
            admin.setUsername("admin");
            admin.setPassword(passwordEncoder.encode("admin123"));
            admin.setRole("ADMIN");
            userRepository.save(admin);
        }

        if (userRepository.findByUsername("user") == null) {
            Users user = new Users();
            user.setUsername("user");
            user.setPassword(passwordEncoder.encode("user123"));
            user.setRole("USER");
            userRepository.save(user);
        }
    }

    public Users findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
