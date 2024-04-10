package com.example.spacca;


import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Carta> mano;

    public User(String username) {
        this.mano = new ArrayList<>();
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    public void prendiCarte(List<Carta> carte) {
        mano.addAll(carte);
        System.out.println(username + " ha ricevuto le seguenti carte: " + carte);
    }
}
