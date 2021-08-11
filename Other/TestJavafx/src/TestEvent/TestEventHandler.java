/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestEvent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class TestEventHandler extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setHgap(10);
        Button okBtn = new Button("OK");
        Scene scene = new Scene(pane,500,400);
        pane.getChildren().add(okBtn);
        Button cancelBtn = new Button("cancel");
        pane.getChildren().add(cancelBtn);
        
        OkButtonHandler okh = new OkButtonHandler();
        okBtn.setOnAction(okh);
        
        cancelBtn.setOnAction((ActionEvent t) -> { //lamda
            System.out.println("You clicked cancel Button.");
        });
        stage.setScene(scene);
        stage.setTitle("Test Event Handler");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
class OkButtonHandler implements EventHandler<ActionEvent> {
    
    @Override
    public void handle(ActionEvent t) {
        t.getSource();
        System.out.println("You clicked OK Button.");
    }
    
}