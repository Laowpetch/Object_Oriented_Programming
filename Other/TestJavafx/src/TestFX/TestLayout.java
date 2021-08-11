/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class TestLayout extends Application{

    @Override                 
    public void start(Stage primarystage) throws Exception {
        StackPane pane = new StackPane();
        Button okBtn = new Button("OK");
        Scene scene = new Scene(pane,400,300);
        pane.getChildren().add(okBtn);
        primarystage.setScene(scene);
        primarystage.setTitle("Test JavaFX Layout");
        primarystage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
