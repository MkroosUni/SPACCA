package com.example.spacca;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Memory {
    private static Memory instance;
    private List<Admin> admins;


    private List<User> giocatori = new ArrayList<>();
    private List<Partita> partite= new ArrayList<>();


    private Memory() {
        // Costruttore privato per evitare l'istanziazione diretta
    }

    public static Memory getInstance() {
        if (instance == null) {
            instance = new Memory();
        }
        return instance;
    }

    public void loadAdminsFromJson(String filePath) throws IOException {
        Gson gson = new Gson();
        Type adminListType = new TypeToken<List<Admin>>(){}.getType();
        try (FileReader reader = new FileReader(filePath)) {
            admins = gson.fromJson(reader, adminListType);
        }
    }
    // Aggiungi i metodi necessari per gestire i giocatori
    public void setGiocatori(List<User> giocatori) {
        this.giocatori = giocatori;
    }

    public void addGiocatori(User player){
        this.giocatori.add(player);
    }
    public void addPartita(Partita partita){
        partite.add(partita);
    }
    public List<Partita> getPartite(){
        return partite;
    }
    public List<User> getGiocatori() {
        return giocatori;
    }
    public List<Admin> getAdmins() {
        return admins;
    }
}
