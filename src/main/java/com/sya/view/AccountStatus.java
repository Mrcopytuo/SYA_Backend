package com.sya.view;

import com.sya.model.User;

public class AccountStatus {

    private Integer id;

    private String username;

    private String email;

    private Integer role;

    public void setUser(User user){
        setId(user.getId());
        setEmail(user.getEmail());
        setRole(user.getRole());
        setUsername(user.getUsername());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
