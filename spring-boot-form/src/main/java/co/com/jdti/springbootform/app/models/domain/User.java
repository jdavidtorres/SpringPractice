package co.com.jdti.springbootform.app.models.domain;

import javax.validation.constraints.NotEmpty;

public class User {

    @NotEmpty(message = "can´t be empty")
    private String username;

    @NotEmpty(message = "can´t be empty")
    private String password;

    @NotEmpty(message = "can´t be empty")
    private String email;

    public User() {
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
