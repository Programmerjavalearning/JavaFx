package com.example.checkboxes;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class checkBox extends Application implements EventHandler {
    private Label title;
    private Label response;
    private Label selected;

    private CheckBox bananaCB;
    private CheckBox mangoCB;
    private CheckBox papayaCB;
    private CheckBox grapCB;
    private String fruits;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Favory fruit");

        title = new Label("What is your favorite fruits ?");
        response = new Label("");
        selected = new Label("");

        bananaCB = new CheckBox("Banana");
        mangoCB = new CheckBox("Mango");
        papayaCB = new CheckBox("Papaya");
        grapCB = new CheckBox("GrapFruit");

        //Setup the stage and scene
        FlowPane flowPaneRoot = new FlowPane(Orientation.VERTICAL, 5,5);

        flowPaneRoot.setAlignment(Pos.CENTER);

        // Where we add our controls
        flowPaneRoot.getChildren().add(title);
        flowPaneRoot.getChildren().addAll(bananaCB,mangoCB,papayaCB,
                grapCB,response,selected);
        
        //add EventListener to our checkboxes

        Scene scene = new Scene(flowPaneRoot,400,250);
        stage.setScene(scene);
        stage.show();

        showAll();

    }

    void showAll (){
        fruits="";
        if (bananaCB.isSelected()) fruits = "Banana";
        selected.setText("Fruits selected = " + fruits);
    }

    public static void main(String[] args) { launch(); }

    @Override
    public void handle(Event event) {
        System.out.println("Test");
        Object fruitsSelected = event.getSource();
        if(bananaCB.equals(fruitsSelected)){
            if(bananaCB.isSelected()){
                response.setText("Banana Selected");
            }else {
                response.setText("Banana not selected");
                showAll();
            }
        }
        if(mangoCB.equals(fruitsSelected)){
            if(mangoCB.isSelected()){
                response.setText("Banana Selected");
            }else {
                response.setText("Banana not selected");
            }
        }


    }
}
