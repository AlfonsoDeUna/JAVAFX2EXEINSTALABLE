package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear un botón
        Button btn = new Button();
        btn.setText("Di 'Hola Mundo'");
        btn.setOnAction(event -> System.out.println("Hola Mundo!"));

        // Crear un layout y añadir el botón
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Crear la escena con el layout
        Scene scene = new Scene(root, 300, 200);

        // Configurar la ventana principal
        primaryStage.setTitle("Hola Mundo JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}