package com.example.secutiry.demo0.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;
    @Column(name = "full_name")
    private String fullname;
    @Column(name = "role")
    private String role;

    @Column(name = "password")
    private String password;

    public User() {
    }

    public User(String email, String fullname, String role, String password) {
        this.email = email;
        this.fullname = fullname;
        this.role = role;
        this.password = password;
    }

    public User(Long id, String email, String fullname, String role, String password) {
        this.id = id;
        this.email = email;
        this.fullname = fullname;
        this.role = role;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
