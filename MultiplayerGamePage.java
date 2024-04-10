package com.example.spacca;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.List;

public class MultiplayerGamePage {
    @FXML
    private TextField usernameField;

    @FXML
    private TextField gameCodeField;
    Memory memory= Memory.getInstance();

    @FXML
    private Label messageLabel;

    @FXML
    protected void accessButtonClicked() {

        // Ottieni il nome utente e il codice partita inseriti nei campi di testo
        String username = usernameField.getText();
        String gameCode = gameCodeField.getText();

        // Crea un nuovo utente con i dati inseriti
        User user = new User(username);
        // Puoi fare qualcosa con l'utente creato, ad esempio passarlo ad un'altra classe o metodo
        System.out.println("User created: " + user.getUsername() + " - Game Code: " + gameCode);


        for(int i =0; i< memory.getPartite().size(); i++){
            if(memory.getPartite().get(i).codice.equals(gameCode)){
                memory.getPartite().get(i).addGiocatore(user);

            }

            messageLabel.setText("partita non trovata");
        }
    }
}
