package com.gmb.goingtothemoonandbeyond;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class StarterController {



    @FXML
    public ChoiceBox<String> Chooser;



    @FXML
    public TextField velocity;
    @FXML
    public TextField oxygen;
    @FXML
    public TextField propellent;


    @FXML
    public void initialize() {
        if(Chooser != null) {
            Chooser.getItems().removeAll(Chooser.getItems());
            Chooser.getItems().addAll("Mercury", "Venus", "Moon", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
            Chooser.getSelectionModel().select("Moon");
        }
    }
    @FXML
    void onStartClick(ActionEvent event) throws IOException {
        if(Chooser.getSelectionModel().getSelectedItem().equals("Mercury")) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MERCURY.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("How to play ");
            alert.setHeaderText(" PLANETS : HOW TO CORRECTLY SET UP THE SHIP");
            alert.setContentText(" Mercury : 80 < propellent < 100, 150 < velocity < 200 and 50 < oxygen < 70");
            alert.showAndWait();

        }
        if(Chooser.getSelectionModel().getSelectedItem().equals("Venus")) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("VENUS.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("How to play ");
            alert.setHeaderText(" PLANETS : HOW TO CORRECTLY SET UP THE SHIP");
            alert.setContentText(" Venus : 70 < propellent < 90, 150 < velocity < 200 and 40 < oxygen < 50");
            alert.showAndWait();
        }
        if(Chooser.getSelectionModel().getSelectedItem().equals("Moon")) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MOON.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("How to play ");
            alert.setHeaderText(" PLANETS : HOW TO CORRECTLY SET UP THE SHIP");
            alert.setContentText(" Moon :  20 < propellent < 40, 60 < velocity < 100 and 20 < oxygen < 40");
            alert.showAndWait();
        }
        if(Chooser.getSelectionModel().getSelectedItem().equals("Mars")) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MARS.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("How to play ");
            alert.setHeaderText(" PLANETS : HOW TO CORRECTLY SET UP THE SHIP");
            alert.setContentText(" Mars : 50 < propellent < 60, 90 < velocity < 150 and 40 < oxygen < 50");
            alert.showAndWait();
        }
        if(Chooser.getSelectionModel().getSelectedItem().equals("Jupiter")) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("JUPITER.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("How to play ");
            alert.setHeaderText(" PLANETS : HOW TO CORRECTLY SET UP THE SHIP");
            alert.setContentText(" Jupiter : 100 < propellent < 150, 200 < velocity < 250 and 60 < oxygen < 80");
            alert.showAndWait();
        }
        if(Chooser.getSelectionModel().getSelectedItem().equals("Saturn")) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SATURN.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("How to play ");
            alert.setHeaderText(" PLANETS : HOW TO CORRECTLY SET UP THE SHIP");
            alert.setContentText(" Saturn : 150 < propellent < 200, 250 < velocity < 300 and 80 < oxygen < 100");
            alert.showAndWait();
        }
        if(Chooser.getSelectionModel().getSelectedItem().equals("Neptune")) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("NEPTUNE.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("How to play ");
            alert.setHeaderText(" PLANETS : HOW TO CORRECTLY SET UP THE SHIP");
            alert.setContentText(" Neptune : 250 < propellent < 300, 350 < velocity < 400 and 120 < oxygen < 140");
            alert.showAndWait();
        }
        if(Chooser.getSelectionModel().getSelectedItem().equals("Uranus")) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("URANUS.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("How to play ");
            alert.setHeaderText(" PLANETS : HOW TO CORRECTLY SET UP THE SHIP");
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
    @FXML
    void onCheck(ActionEvent event) throws IOException {

        if(Chooser.getSelectionModel().getSelectedItem().equals("Mercury")){
            if(Integer.parseInt(oxygen.getText()) == 90 && Integer.parseInt(propellent.getText()) == 180 && Integer.parseInt(velocity.getText()) == 70){
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
        if(Chooser.getSelectionModel().getSelectedItem().equals("Venus")){
            if(Integer.parseInt(oxygen.getText()) == 80 && Integer.parseInt(propellent.getText()) == 170 && Integer.parseInt(velocity.getText()) == 40){
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
        if(Chooser.getSelectionModel().getSelectedItem().equals("Moon")){
            if(Integer.parseInt(oxygen.getText()) == 30 && Integer.parseInt(propellent.getText()) == 80 && Integer.parseInt(velocity.getText()) == 40){
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
        if(Chooser.getSelectionModel().getSelectedItem().equals("Mars")){
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        if(Chooser.getSelectionModel().getSelectedItem().equals("Jupiter")){
            if(Integer.parseInt(oxygen.getText()) == 130 && Integer.parseInt(propellent.getText()) == 230 && Integer.parseInt(velocity.getText()) == 70){
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
        if(Chooser.getSelectionModel().getSelectedItem().equals("Saturn")){
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        if(Chooser.getSelectionModel().getSelectedItem().equals("Uranus")) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

            if(Chooser.getSelectionModel().getSelectedItem().equals("Neptune")) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("travelling.fxml")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ship_explosion")));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }


        }


    @FXML private final TableView<String> Data = new TableView<>();
    @FXML
    void onSave(ActionEvent event) {
        try {
            FileChooser fileChooser = new FileChooser();
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("JSON files (*.json)", "*.json");
            fileChooser.getExtensionFilters().add(extFilter);

            File file = fileChooser.showSaveDialog(null);
            if (file != null) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.registerModule(new JavaTimeModule());
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, Data.getItems());
            }
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR, "Could not save data").showAndWait();
        }


    }

    @FXML
    void onCampaignClick(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        Stage stage = new Stage();
        fileChooser.setTitle("Open Resource File");
        fileChooser.showOpenDialog(stage);

    }
@FXML
void onHow(ActionEvent event){
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("How to play ");
alert.setHeaderText(" PLANETS : HOW TO CORRECTLY SET UP THE SHIP");

    if(Chooser.getSelectionModel().getSelectedItem().equals("Neptune")) {
        alert.setContentText(" Neptune : 250 < propellent < 300, 350 < velocity < 400 and 120 < oxygen < 140");

        alert.showAndWait();
    }
    if(Chooser.getSelectionModel().getSelectedItem().equals("Mercury")) {
        alert.setContentText(" Mercury : 80 < propellent < 100, 150 < velocity < 200 and 50 < oxygen < 70");
        alert.showAndWait();
    }
    if(Chooser.getSelectionModel().getSelectedItem().equals("Venus")) {
        alert.setContentText(" Venus : 70 < propellent < 90, 150 < velocity < 200 and 40 < oxygen < 50");
        alert.showAndWait();
    }
    if(Chooser.getSelectionModel().getSelectedItem().equals("Moon")) {
        alert.setContentText(" Moon :  20 < propellent < 40, 60 < velocity < 100 and 20 < oxygen < 40");
        alert.showAndWait();
    }
    if(Chooser.getSelectionModel().getSelectedItem().equals("Mars")) {
        alert.setContentText(" Mars : 50 < propellent < 60, 90 < velocity < 150 and 40 < oxygen < 50");
        alert.showAndWait();
    }
    if(Chooser.getSelectionModel().getSelectedItem().equals("Jupiter")) {
        alert.setContentText(" Jupiter : 100 < propellent < 150, 200 < velocity < 250 and 60 < oxygen < 80");
        alert.showAndWait();
    }
    if(Chooser.getSelectionModel().getSelectedItem().equals("Saturn")) {
        alert.setContentText(" Saturn : 150 < propellent < 200, 250 < velocity < 300 and 80 < oxygen < 100");
        alert.showAndWait();
    }
    if(Chooser.getSelectionModel().getSelectedItem().equals("Uranus")) {
        alert.setContentText(" Uranus : 200 < propellent < 250, 300 < velocity < 350 and 100 < oxygen < 120");
        alert.showAndWait();
    }

}
    @FXML
    void onClose(ActionEvent event) {
        System.exit(0);

    }
}


