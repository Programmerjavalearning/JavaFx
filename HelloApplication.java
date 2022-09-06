package com.example.hellojavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Label myLabel;
    private TextField nameTextField;

    @Override
    public void start(Stage primaryStage) throws IOException {

        primaryStage.setTitle("Hello JavaFx");
        myLabel = new Label();
        nameTextField = new TextField();

        myLabel.setText("Hello i'm a label");
        nameTextField.setPromptText("Enter your name");

        Button button = new Button();
        button.setText("Click Me!");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {


                String name = nameTextField.getText().trim();
                button.setText("Button Clicked");
                myLabel.setText(name);

            }
        });

        FlowPane flowPaneRoot = new FlowPane(10,10);
        flowPaneRoot.setAlignment(Pos.CENTER);

       // StackPane root = new StackPane();
        flowPaneRoot.getChildren().add(button);
        flowPaneRoot.getChildren().add(myLabel);
        flowPaneRoot.getChildren().add(nameTextField);
        Scene scene = new Scene(flowPaneRoot, 250, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
