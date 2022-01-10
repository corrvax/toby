package com.springbook.toby.user.domain;

public class User {
    String name;
    String id;
    String password;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(String id) {
        this.id = id;
    }
}
