package com.example.secutiry.demo0.dto;

import jakarta.persistence.Column;

public class UserDto {

    private String email;
    private String fullname;
    private String role;
    private String password;

    public UserDto(String email, String fullname, String role, String password) {
        this.email = email;
        this.fullname = fullname;
        this.role = role;
        this.password = password;
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
