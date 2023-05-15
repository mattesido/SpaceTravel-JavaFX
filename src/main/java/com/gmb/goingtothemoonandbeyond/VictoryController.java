package com.gmb.goingtothemoonandbeyond;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class VictoryController {
    @FXML
    private Label points;
    @FXML
    void onRestart(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("graphics.fxml")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void onClickPoints(ActionEvent event) {

        if (StarterController.whereAmI.equals("Mercury")){
            points.setVisible(true);
            points.setText("40");

            
        }
        if (StarterController.whereAmI.equals("Venus")){
            points.setVisible(true);
            points.setText("30");
        }
        if (StarterController.whereAmI.equals("Mars")){
            points.setVisible(true);
            points.setText("20");
        }
        if (StarterController.whereAmI.equals("Moon")){
            points.setVisible(true);
            points.setText("10");
        }
        if (StarterController.whereAmI.equals("Jupiter")){
            points.setVisible(true);
            points.setText("50");
        }
        if (StarterController.whereAmI.equals("Saturn")){
            points.setVisible(true);
            points.setText("60");
        }
        if (StarterController.whereAmI.equals("Uranus")){
            points.setVisible(true);
            points.setText("70");
        }
        if (StarterController.whereAmI.equals("Neptune")){
            points.setVisible(true);
            points.setText("80");
        }

    }


}
