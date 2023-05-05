package com.gmb.goingtothemoonandbeyond;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class PlanetController {

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
        Image planet = switch (StarterController.whereAmI) {
            case "Mercury" -> new Image("com/gmb/goingtothemoonandbeyond/MERCURY.jpeg");
            case "Jupiter" -> new Image("com/gmb/goingtothemoonandbeyond/JUPITER.jpeg");
            case "Mars" -> new Image("com/gmb/goingtothemoonandbeyond/MARS.jpeg");
            case "Moon" -> new Image("com/gmb/goingtothemoonandbeyond/MOON.jpeg");
            case "Neptune" -> new Image("com/gmb/goingtothemoonandbeyond/NEPTUNE.jpeg");
            case "Saturn" -> new Image("com/gmb/goingtothemoonandbeyond/SATURN.jpeg");
            case "Uranus" -> new Image("com/gmb/goingtothemoonandbeyond/URANUS.jpeg");
            default -> new Image("com/gmb/goingtothemoonandbeyond/VENUS.jpeg");
        };

        image.setImage(planet);
    }

    @FXML
    void onCheck(ActionEvent event) throws IOException {
        if (StarterController.whereAmI.equals("Mercury")) {

            if (Integer.parseInt(oxygen.getText()) == 90 && Integer.parseInt(propellent.getText()) == 180 && Integer.parseInt(velocity.getText()) == 70) {
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
        if (StarterController.whereAmI.equals("Venus")) {
            if (Integer.parseInt(oxygen.getText()) == 80 && Integer.parseInt(propellent.getText()) == 170 && Integer.parseInt(velocity.getText()) == 40) {
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
        if (StarterController.whereAmI.equals("Moon")) {
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
        if (StarterController.whereAmI.equals("Mars")) {
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

        if (StarterController.whereAmI.equals("Jupiter")) {
            if (Integer.parseInt(oxygen.getText()) == 130 && Integer.parseInt(propellent.getText()) == 230 && Integer.parseInt(velocity.getText()) == 70) {
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
        if (StarterController.whereAmI.equals("Saturn")) {
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

        if (StarterController.whereAmI.equals("Uranus")) {
            if ((Integer.parseInt(oxygen.getText()) == 230) && (Integer.parseInt(propellent.getText()) == 330) && (Integer.parseInt(velocity.getText()) == 110)) {
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

        if (StarterController.whereAmI.equals("Neptune")) {
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
    void onHelp(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("How to play ");
        alert.setHeaderText(" PLANETS : HOW TO CORRECTLY SET UP THE SHIP");

        if (StarterController.whereAmI.equals("Neptune")) {
            alert.setContentText(" Neptune : 250 < propellent < 300, 350 < velocity < 400 and 120 < oxygen < 140");

            alert.showAndWait();
        }
        if (StarterController.whereAmI.equals("Mercury")) {
            alert.setContentText(" Mercury : 80 < propellent < 100, 150 < velocity < 200 and 50 < oxygen < 70");
            alert.showAndWait();
        }
        if (StarterController.whereAmI.equals("Venus")) {
            alert.setContentText(" Venus : 70 < propellent < 90, 150 < velocity < 200 and 40 < oxygen < 50");
            alert.showAndWait();
        }
        if (StarterController.whereAmI.equals("Moon")) {
            alert.setContentText(" Moon :  20 < propellent < 40, 60 < velocity < 100 and 20 < oxygen < 40");
            alert.showAndWait();
        }
        if (StarterController.whereAmI.equals("Mars")) {
            alert.setContentText(" Mars : 50 < propellent < 60, 90 < velocity < 150 and 40 < oxygen < 50");
            alert.showAndWait();
        }
        if (StarterController.whereAmI.equals("Jupiter")) {
            alert.setContentText(" Jupiter : 100 < propellent < 150, 200 < velocity < 250 and 60 < oxygen < 80");
            alert.showAndWait();
        }
        if (StarterController.whereAmI.equals("Saturn")) {
            alert.setContentText(" Saturn : 150 < propellent < 200, 250 < velocity < 300 and 80 < oxygen < 100");
            alert.showAndWait();
        }
        if (StarterController.whereAmI.equals("Uranus")) {
            alert.setContentText(" Uranus : 200 < propellent < 250, 300 < velocity < 350 and 100 < oxygen < 120");
            alert.showAndWait();
        }
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