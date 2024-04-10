package com.example.spacca;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class LoginPageController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;
    Memory memoria = Memory.getInstance();

    private List<Admin> admins;



    @FXML
    protected void loginButtonClicked() throws IOException {
        this.admins=memoria.getAdmins();
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (Admin.authenticate(admins, username, password)) {
            openAdminPanel();
        } else {
            showError("Credenziali non valide per l'accesso admin.");
        }
    }

    private void openAdminPanel() {
        try {
            // Carica il file FXML della pagina Admin Panel
            FXMLLoader loader = new FXMLLoader(getClass().getResource("admin-panel.fxml"));

            // Carica il layout dalla radice del file FXML
            Parent root = loader.load();

            // Crea una nuova finestra per la pagina dell'Admin Panel
            Stage adminStage = new Stage();
            adminStage.setScene(new Scene(root));

            // Mostra la finestra dell'Admin Panel
            adminStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Errore");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}