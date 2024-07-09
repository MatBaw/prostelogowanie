package com.example.czwarta;

public class User {
    private String login;
    private String password;

    // Domyślny konstruktor
    public User() {
    }

    // Konstruktor z argumentami
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    // Gettery i Settery
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
