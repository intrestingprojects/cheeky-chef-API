package com.cheekychef.cheekychef.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "LogIn")
public class LogIn {
    private String email;
    private String password;
    private String name;

    public LogIn(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    //CAN USE LAMBOK INSTEAD OF GETTER AND SETTER
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
