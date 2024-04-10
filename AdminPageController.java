package com.example.spacca;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Random;

public class AdminPageController {
    String codice;

    Memory memory = Memory.getInstance();

    @FXML
    private TextField partitaTextField;

    @FXML
    private TextField codiceTextField;

    @FXML
    protected void generaCodiceButtonClicked() {
        String nomePartita = partitaTextField.getText();
        // Genera un codice univoco randomico
         codice = generaCodiceUnivoco();

        // Imposta il codice generato nel campo di testo
        codiceTextField.setText(codice);


    }

    @FXML
    protected void generaPartitaSingolaButtonClicked() {
        // Implementa qui la logica per generare una partita singola
        Partita partita = new Partita(codice);
        memory.addPartita(partita);

    }

    @FXML
    protected void generaPartitaMultiplayerButtonClicked() {
        // Implementa qui la logica per generare una partita multiplayer
        Partita partita = new Partita(codice);
        memory.addPartita(partita);
    }

    @FXML
    protected void generaPartitaTorneoButtonClicked() {
        // Implementa qui la logica per generare un torneo
        Partita partita = new Partita(codice);
        memory.addPartita(partita);
    }
    private String generaCodiceUnivoco() {
        // Genera un codice univoco randomico di lunghezza 6
        StringBuilder codice = new StringBuilder();
        Random random = new Random();
        String caratteriPermessi = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(caratteriPermessi.length());
            codice.append(caratteriPermessi.charAt(index));
        }
        return codice.toString();
    }
}