package com.example.ecommerce;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

//TODO 15: In src/main/java/com/example/ecommerce, create a new class called User.
//TODO 16: Annotate the User class with @Entity.
@Entity
public class Users {
    //TODO 17: Define the following fields in the User class:
    //    id (Long)
    //    username (String)
    //    password (String)
    //    role (String)
    //TODO 19: Annotate the id field with @Id and @GeneratedValue(strategy = GenerationType.IDENTITY).

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role;

    //TODO 18: Use your IDE to generate constructors, getters, and setters for the User class. These methods do not require additional customization and can be used as is.
    public Users() {
    }
    public Users(Long id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Users user = (Users) o;
        return Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, role);
    }
}
