package com.example.spacca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Partita {
    private List<Carta> mazzo;
    private List<User> giocatori;
    Memory memory = Memory.getInstance();

    String codice;
    // Costruttore della partita
    public Partita(String codice) {
        this.codice=codice;
        this.giocatori = memory.getGiocatori();
        // Inizializza il mazzo di carte
        mazzo = new ArrayList<>();
        creaMazzo();
        mescolaMazzo();
    }

    // Metodo per creare il mazzo di carte
    private void creaMazzo() {
        for (int seme = Carta.CUORI; seme <= Carta.PICCHE; seme++) {
            for (int valore = Carta.DUE; valore <= Carta.ASSO; valore++) {
                mazzo.add(new Carta(seme, valore));
            }
        }
    }

    // Metodo per mescolare il mazzo di carte
    private void mescolaMazzo() {
        Collections.shuffle(mazzo);
    }
    public void addGiocatore(User u){
        giocatori.add(u);
    }
    // Metodo per distribuire un numero specifico di carte ai giocatori
    public void distribuisciCarte(int numeroCarte) {
        for (User User : giocatori) {
            List<Carta> carteDistribuite = new ArrayList<>();
            for (int i = 0; i < numeroCarte; i++) {
                carteDistribuite.add(prendiCarta());
            }
            User.prendiCarte(carteDistribuite);
        }
    }

    // Metodo per prendere una carta dal mazzo
    private Carta prendiCarta() {
        if (mazzo.isEmpty()) {
            // Ricrea il mazzo e lo mescola se è vuoto
            creaMazzo();
            mescolaMazzo();
        }
        return mazzo.remove(0);
    }

    // Metodo per giocare una mano di carte
    public void giocaMano() {
        // Simulazione di una mano di carte
        distribuisciCarte(5);
    }
/*
    public static void main(String[] args) {
        // Creazione dei giocatori
        User User1 = new User("User 1");
        User User2 = new User("User 2");

        // Creazione e avvio della partita
        List<User> giocatori = new ArrayList<>();
        giocatori.add(User1);
        giocatori.add(User2);
        Partita partita = new Partita(giocatori);
        partita.giocaMano();
    }*/
}

