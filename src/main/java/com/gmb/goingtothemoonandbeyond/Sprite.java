package com.gmb.goingtothemoonandbeyond;

import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.layout.Region;


    public class Sprite extends Region {
        PVector location;
        PVector velocity;
        PVector acceleration;

        Node view;



        public Sprite(Node view, PVector location) {
            this.view = view;
            this.location = location;
            this.velocity = new PVector(0, 0);
            this.acceleration = new PVector(0, 0);
            getChildren().add(view);
        }

        public Sprite(Node view, PVector location, PVector velocity) {
            this.view = view;
            this.location = location;
            this.velocity = velocity;
            this.acceleration = new PVector(0, 0);
            getChildren().add(view);
        }



        public PVector getVelocity() {
            return velocity;
        }

        public void update() {
            velocity = velocity.add(acceleration);
            velocity = velocity.limit(BallsSettings.SPRITE_MAX_SPEED);
            location = location.add(velocity);
        }

        public boolean intersects(Sprite other) {
            return getBoundsInParent().intersects(other.getBoundsInParent());
        }

        public boolean contains(Point2D point) {
            return getBoundsInParent().contains(point);
        }

        public void display() {
            setTranslateX(location.x);
            setTranslateY(location.y);
        }
    }

