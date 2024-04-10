package com.example.spacca;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class GamePageController {
    @FXML
    private Button singlePlayerButton;

    @FXML
    private Button multiplayerButton;

    @FXML
    private Button tournamentButton;

    @FXML
    protected void singlePlayerButtonClicked() throws IOException {
        // Azione quando viene premuto il pulsante "Single Player"
        System.out.println("Single Player selected");
        // Carica la pagina del gioco per il giocatore singolo
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SinglePlayerGamePage.fxml"));
        Stage stage = (Stage) singlePlayerButton.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void multiplayerButtonClicked() throws IOException {
        // Azione quando viene premuto il pulsante "Multiplayer"
        System.out.println("Multiplayer selected");
        // Carica la pagina del gioco multiplayer
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MultiplayerGamePage.fxml"));
        Stage stage = (Stage) multiplayerButton.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void tournamentButtonClicked() throws IOException {
        // Azione quando viene premuto il pulsante "Torneo"
        System.out.println("Torneo selected");
        // Carica la pagina del torneo
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TournamentGamePage.fxml"));
        Stage stage = (Stage) tournamentButton.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }
}
