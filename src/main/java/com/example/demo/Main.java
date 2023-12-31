package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene scene1,scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
         window =primaryStage;
         Label label1=new Label("Welcome to First Scene!");
        Button button1=new Button("Go to Scene2");
        button1.setOnAction(e->window.setScene(scene2));
         //layout 1
        VBox layout1=new VBox(20);
        layout1.getChildren().addAll(label1,button1);
        scene1=new Scene(layout1,200,200);

        Button button2=new Button("This is scene 2,go back to scene 1");
        button2.setOnAction(e->window.setScene(scene1));

        //Layout 2
        StackPane layout2=new StackPane();
        layout2.getChildren().add(button2);
        scene2=new Scene(layout2,600,300);


        window.setScene(scene1);
        window.setTitle("Title here");
        window.show();

    }
}
