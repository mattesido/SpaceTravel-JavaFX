package com.gmb.goingtothemoonandbeyond;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class ShipController {
        static RandomGenerator rnd = RandomGenerator.getDefault();
        @FXML
        private Pane root;
        AnimationTimer timer;
        HashMap<String, Image> resources;
        ShipSprite ship;


    @FXML
    void onStartClick(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loadResources();
        root = new Pane();
        root.setPrefSize(800, 800);
        root.setBackground(new Background(new BackgroundFill(Color.web("000011"), CornerRadii.EMPTY, Insets.EMPTY)));
        Scene scene = new Scene(root);
        scene.setOnKeyPressed(event1 -> {
            switch (event1.getCode()) {
                case SPACE -> shootShip();
                case LEFT -> ship.getVelocity().x = -5;
                case RIGHT -> ship.getVelocity().x = 5;
                case Q -> Platform.exit();
            }
        });
        scene.setOnKeyReleased(event1 -> {
            switch (event1.getCode()) {
                case LEFT, RIGHT -> ship.getVelocity().x = 0;
            }
        });

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        initializeGameObjects();
        initializeTimer();
    }

    private void loadResources() {
        resources = new HashMap<>();
        resources.put("ship_missile", new Image(Objects.requireNonNull(getClass().getResourceAsStream("ship_missile.png")), 20, 30, false, true));
        resources.put("ship", new Image(Objects.requireNonNull(getClass().getResourceAsStream("ship.png")), 60, 60, false, true));
        resources.put("alien", new Image(Objects.requireNonNull(getClass().getResourceAsStream("alien.png")), 50, 50, false, true));
    }

    private void shootShip() {
        PVector location = new PVector(ship.getTranslateX() + 15, ship.getTranslateY() - 20);
        PVector velocity = new PVector(0, -10);
        root.getChildren().add(new ShipSprite(new ImageView(resources.get("ship_missile")), location, velocity, "ship_missile"));
    }

    private void initializeGameObjects() {
        // remove all sprites
        root.getChildren().removeIf(x -> (x instanceof ShipSprite));
        // ship
        ship = new ShipSprite(new ImageView(resources.get("ship")), new PVector(400, 680), "ship");
        root.getChildren().add(ship);
        // aliens
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 7; col++) {
                ShipSprite alien = new ShipSprite(new ImageView(resources.get("alien")), new PVector(120 + 80 * col, 80 + 60 * row), new PVector(0.15, 0.05), "alien");
                root.getChildren().add(alien);
            }
        }
    }

    private void initializeTimer() {
        timer = new AnimationTimer() {

            @Override
            public void handle(long now) {
                mainLoop();
            }
        };
        timer.start();
    }

    private void mainLoop() {
        List<ShipSprite> sprites = sprites();
        List<ShipSprite> aliens = sprites("alien");
        List<ShipSprite> alienMissiles = sprites("alien_missile");
        List<ShipSprite> shipMissiles = sprites("ship_missile");
        // one random alien shoots
        if (rnd.nextDouble() < 0.02) {
            shooAlien(aliens.get(rnd.nextInt(aliens.size())));
        }
        // change aliens direction on the x-axis
        if (rnd.nextDouble() < 0.002) {
            aliens.forEach(x -> x.getVelocity().x *= -1);
        }
        // missiles kill stuff
        alienMissiles.stream().filter(m -> m.intersects(ship)).forEach(m -> {
            m.setAlive(false);
            ship.setAlive(false);
        });
        shipMissiles.forEach(m -> aliens.stream().filter(a -> a.intersects(m)).forEach(a -> {
            m.setAlive(false);
            a.setAlive(false);
        }));
        // updates sprites
        sprites.forEach(Sprite::update);
        sprites.forEach(Sprite::display);
        // remove all references of out-of-screen nodes and dead entities
        root.getChildren().removeIf(s -> (s.getTranslateY() > root.getHeight()) || (s.getTranslateY() < 0));
        root.getChildren().removeIf(x -> (x instanceof ShipSprite) && (!((ShipSprite) x).isAlive()));
        // new game?
        if (!ship.isAlive() || aliens.size() == 0)
            initializeGameObjects();
    }

    private List<ShipSprite> sprites() {
        return root.getChildren().stream().filter(x -> x instanceof ShipSprite).map(x -> (ShipSprite) x).collect(Collectors.toList());
    }

    private List<ShipSprite> sprites(String description) {
        return root.getChildren().stream().filter(x -> x instanceof ShipSprite).map(x -> (ShipSprite) x).filter(x -> x.getDescription().equals(description)).collect(Collectors.toList());
    }

    private void shooAlien(ShipSprite alien) {
        PVector location = new PVector(alien.getTranslateX() + 15, alien.getTranslateY() + 50);
        PVector velocity = new PVector(0, 5);
        root.getChildren().add(new ShipSprite(new Circle(5, Color.WHITE), location, velocity, "alien_missile"));
    }
}
