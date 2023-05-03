package com.gmb.goingtothemoonandbeyond;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class StarterApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StarterApplication.class.getResource("graphics.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Going to the moon and beyond!");
        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("spaceship icon vector.svg"))));
        stage.setMinHeight(Screen.getPrimary().getBounds().getHeight());
        stage.setMinWidth(Screen.getPrimary().getBounds().getWidth());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}