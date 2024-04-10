package com.example.spacca;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        try {
            // Carica il file FXML della pagina di login
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login-page.fxml"));
            Parent root = loader.load();

            // Crea una nuova scena e la imposta sulla finestra
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);

            // Mostra la finestra di login
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void onPlayButtonClick() {
        try {
            // Carica il file FXML della pagina di gioco
            FXMLLoader loader = new FXMLLoader(getClass().getResource("game-page.fxml"));
            Parent root = loader.load();

            // Crea una nuova scena e la imposta sulla finestra
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);

            // Mostra la finestra di gioco
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
