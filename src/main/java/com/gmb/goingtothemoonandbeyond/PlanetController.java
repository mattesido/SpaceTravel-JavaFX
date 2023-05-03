package com.gmb.goingtothemoonandbeyond;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class PlanetController {

    @FXML
    private Button check;

    @FXML
    private ImageView image;

    @FXML
    private TextField oxygen;

    @FXML
    private TextField propellent;

    @FXML
    private TextField velocity;

    @FXML
    public void initialize() {
        Image planet;

        if (StarterController.whereAmI.equals("Mercury")) {
            planet = new Image("com/gmb/goingtothemoonandbeyond/MERCURY.jpeg");
        } else if (StarterController.whereAmI.equals("Jupiter")) {
            planet = new Image("com/gmb/goingtothemoonandbeyond/JUPITER.jpeg");
        } else if (StarterController.whereAmI.equals("Mars")) {
            planet = new Image("com/gmb/goingtothemoonandbeyond/MARS.jpeg");


        } else if (StarterController.whereAmI.equals("Moon")) {
            planet = new Image("com/gmb/goingtothemoonandbeyond/MOON.jpeg");
        } else if (StarterController.whereAmI.equals("Neptune")) {
            planet = new Image("com/gmb/goingtothemoonandbeyond/NEPTUNE.jpeg");
        } else if (StarterController.whereAmI.equals("Saturn")) {
            planet = new Image("com/gmb/goingtothemoonandbeyond/SATURN.jpeg");
        } else if (StarterController.whereAmI.equals("Uranus")) {
            planet = new Image("com/gmb/goingtothemoonandbeyond/URANUS.jpeg");
        } else {
            planet = new Image("com/gmb/goingtothemoonandbeyond/VENUS.jpeg");
        }

        image.setImage(planet);
    }

    @FXML
    void onCheck(ActionEvent event) throws IOException {
        if (StarterController.whereAmI.equals("Mercury")){

            if(Integer.parseInt(oxygen.getText()) == 90 && Integer.parseInt(propellent.getText()) == 180 && Integer.parseInt(velocity.getText()) == 70){
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
        if(StarterController.whereAmI.equals("Venus")){
            if(Integer.parseInt(oxygen.getText()) == 80 && Integer.parseInt(propellent.getText()) == 170 && Integer.parseInt(velocity.getText()) == 40){
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
        if(StarterController.whereAmI.equals("Moon")){
            if(Integer.parseInt(oxygen.getText()) == 30 && Integer.parseInt(propellent.getText()) == 80 && Integer.parseInt(velocity.getText()) == 40){
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
        if(StarterController.whereAmI.equals("Mars")) {
            if (Integer.parseInt(oxygen.getText()) == 30 && Integer.parseInt(propellent.getText()) == 80 && Integer.parseInt(velocity.getText()) == 40) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }

        if(StarterController.whereAmI.equals("Jupiter")){
            if(Integer.parseInt(oxygen.getText()) == 130 && Integer.parseInt(propellent.getText()) == 230 && Integer.parseInt(velocity.getText()) == 70){
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
        if(StarterController.whereAmI.equals("Saturn")) {
            if (Integer.parseInt(oxygen.getText()) == 180 && Integer.parseInt(propellent.getText()) == 280 && Integer.parseInt(velocity.getText()) == 90) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }

        if(StarterController.whereAmI.equals("Uranus")) {
            if (Integer.parseInt(oxygen.getText()) == 230 && Integer.parseInt(propellent.getText()) == 330 && Integer.parseInt(velocity.getText()) == 110) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }

        if(StarterController.whereAmI.equals("Neptune")) {
            if (Integer.parseInt(oxygen.getText()) == 240 && Integer.parseInt(propellent.getText()) == 340 && Integer.parseInt(velocity.getText()) == 130) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
    }

    @FXML
    void onClose(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void onRestart(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("graphics.fxml")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}