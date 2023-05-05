package com.gmb.goingtothemoonandbeyond;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ShipExplosionController {

    @FXML
    void onGoBack(ActionEvent event) throws IOException {
        if (StarterController.whereAmI.equals("Mercury")){
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("planet.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if (StarterController.whereAmI.equals("Venus")){
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("planet.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if (StarterController.whereAmI.equals("Saturn")){
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("planet.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if (StarterController.whereAmI.equals("Moon")){
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("planet.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if (StarterController.whereAmI.equals("Mars")){
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("planet.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if (StarterController.whereAmI.equals("Jupiter")){
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("planet.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if (StarterController.whereAmI.equals("Uranus")){
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("planet.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if (StarterController.whereAmI.equals("Neptune")){
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("planet.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
}


