package com.gmb.goingtothemoonandbeyond;

import javafx.animation.AnimationTimer;


import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;


import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

import javafx.scene.paint.Color;

import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class ShipController {



    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
int score;
    @FXML
    void onStartClick(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        BorderPane root = new BorderPane();
        Scene mainScene = new Scene(root);
        stage.setScene(mainScene);

        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext context = canvas.getGraphicsContext2D();
        root.setCenter(canvas);

        context.setFill(Color.BLUE);
        context.fillRect(0,0, WIDTH, HEIGHT);



        // handles continuous inputs (as long as key is pressed)
        ArrayList<String> keyPressedList = new ArrayList<>();

        // handles discrete inputs (one per key press)
        ArrayList<String> keyJustPressedList = new ArrayList<>();

        mainScene.setOnKeyPressed(
                (KeyEvent event1) -> {
                    String keyName = event1.getCode().toString();
                    //avoid adding duplicates to list
                    if (!keyPressedList.contains(keyName)) {
                        keyPressedList.add(keyName);
                        keyJustPressedList.add(keyName);
                    }
                }
        );

        mainScene.setOnKeyReleased(
                (KeyEvent event1) -> {
                    String keyName = event1.getCode().toString();
                    if (keyPressedList.contains(keyName)) {
                        keyPressedList.remove(keyName);
                    }
                }
        );

        Sprite background = new Sprite("com/gmb/goingtothemoonandbeyond/space.png");
        background.position.set(400,300);

        Sprite spaceShip = new Sprite("com/gmb/goingtothemoonandbeyond/spaceship.png");
        spaceShip.position.set(100,300);

        ArrayList<Sprite> laserList = new ArrayList<>();
        ArrayList<Sprite> asteroidList = new ArrayList<>();

        int asteroidCount = 6;
        for (int n = 0; n < asteroidCount; n++) {
            Sprite asteroid = new Sprite("com/gmb/goingtothemoonandbeyond/asteroid.png");
            double x = 500 * Math.random() + 300; // 300-800
            double y = 400 * Math.random() + 100; // 100-500
            asteroid.position.set(x,y);
            double angle = 360 * Math.random();
            asteroid.velocity.setLength(50);
            asteroid.velocity.setAngleInDegrees(angle);
            asteroidList.add(asteroid);
        }

        score = 0;
        AnimationTimer gameLoop = new AnimationTimer() {
            @Override
            public void handle(long nanoTime) {
                // process user input
                if (keyPressedList.contains("LEFT")) {
                    spaceShip.rotationInDegrees -= 3;
                }

                if (keyPressedList.contains("RIGHT")) {
                    spaceShip.rotationInDegrees += 3;
                }

                if (keyPressedList.contains("UP")) {
                    spaceShip.velocity.setLength(150);
                    spaceShip.velocity.setAngleInDegrees(spaceShip.rotationInDegrees);
                } else {
                    spaceShip.velocity.setLength(0);
                }

                if (keyJustPressedList.contains("SPACE")) {
                    Sprite laser = new Sprite("com/gmb/goingtothemoonandbeyond/laser.png");
                    laser.position.set(spaceShip.position.x, spaceShip.position.y);
                    laser.velocity.setLength(400);
                    laser.velocity.setAngleInDegrees(spaceShip.rotationInDegrees);
                    laserList.add(laser);
                }

                //after processing user input, clear the just pressed list
                keyJustPressedList.clear();

                spaceShip.update(1/60.0);

                for (Sprite asteroid : asteroidList) {
                    asteroid.update(1/60.0);
                }

                // update lasers; destroy if 2 seconds passed
                for (int n=0; n <laserList.size(); n++) {
                    Sprite laser = laserList.get(n);
                    laser.update(1/60.0);
                    if (laser.elapseTimeSeconds > 2) {
                        laserList.remove(n);
                    }
                }

                // when laser overlaps asteroid, remove both
                for (int laserNum = 0; laserNum < laserList.size(); laserNum++) {
                    Sprite laser = laserList.get(laserNum);
                    for (int asteroidNum = 0; asteroidNum < asteroidList.size(); asteroidNum++) {
                        Sprite asteroid = asteroidList.get(asteroidNum);
                        if (laser.overlaps(asteroid)) {
                            laserList.remove(laserNum);
                            asteroidList.remove(asteroidNum);
                            score += 100;
                        }
                    }
                }

                background.render(context);
                spaceShip.render(context);
                for (Sprite laser : laserList) {
                    laser.render(context);
                }
                for (Sprite asteroid : asteroidList) {
                    asteroid.render(context);
                }

                // draw score on screen
                context.setFill(Color.WHITE);
                context.setStroke(Color.GREEN);
                context.setFont(new Font("Arial Black", 48));
                context.setLineWidth(3);
                String text = "Score: " + score;
                int textX = 500;
                int textY = 50;
                context.fillText(text, textX, textY);
                context.strokeText(text, textX, textY);
            }
        };
        if(score == 500){
            gameLoop.stop();
            stage.close();
            Parent root2 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("planet.fxml")));
            Stage stage1 = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        gameLoop.start();
        stage.show();
    }
        
}

