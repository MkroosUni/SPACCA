package com.example.spacca;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        Memory memory= Memory.getInstance();
        memory.loadAdminsFromJson("C:\\Users\\russo\\IdeaProjects\\SPACCA\\src\\main\\java\\com\\example\\spacca\\admins.json");


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}