package com.gmb.goingtothemoonandbeyond;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DialogPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class VictoryController {
    @FXML
    void onRestart(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("graphics.fxml")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void onPoints(ActionEvent event) {
int  point = 0;
        if (StarterController.whereAmI.equals("Mercury")){
            point += 40;

            
        }
        if (StarterController.whereAmI.equals("Venus")){
            point += 30;
        }
        if (StarterController.whereAmI.equals("Mars")){
            point += 20;
        }
        if (StarterController.whereAmI.equals("Moon")){
            point += 10;
        }
        if (StarterController.whereAmI.equals("Jupiter")){
            point += 50;
        }
        if (StarterController.whereAmI.equals("Saturn")){
            point += 60;
        }
        if (StarterController.whereAmI.equals("Uranus")){
            point += 70;
        }
        if (StarterController.whereAmI.equals("Neptune")){
            point += 80;
        }

    }


}
