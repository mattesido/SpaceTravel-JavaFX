package com.gmb.goingtothemoonandbeyond;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;



    public class Sprite  {
        public Vector position;
        public Vector velocity;
        public double rotationInDegrees;
        public Rectangle boundary;
        public Image image;
        public double elapseTimeSeconds;


        public Sprite() {
            position = new Vector();
            velocity = new Vector();
            rotationInDegrees = 0;
            boundary = new Rectangle();
            elapseTimeSeconds = 0;
        }

        public Sprite(String imageFileName) {
            this();
            setImage(imageFileName);
        }

        public void setImage(String imageFileName) {
            image = new Image(imageFileName);
            boundary.setSize(image.getWidth(), image.getHeight());
        }

        public Rectangle getBoundary() {
            boundary.setPosition(position.x, position.y);
            return boundary;
        }

        public boolean overlaps(Sprite other) {
            return this.getBoundary().overlaps(other.getBoundary());
        }

        public void wrap(double screenWidth, double screenHeight) {
            //TODO: take into account the centre of the object

            double halfWidth = image.getWidth()/2;
            double halfHeight = image.getHeight()/2;

            if (position.x + halfWidth < 0) {
                position.x = screenWidth + halfWidth;
            }
            if (position.x > screenWidth + halfWidth) {
                position.x = -halfWidth;
            }
            if (position.y + halfWidth < 0) {
                position.y = screenHeight + halfHeight;
            }
            if (position.y > screenHeight + halfHeight) {
                position.y = -halfHeight;
            }
        }

        public void update(double deltaTime) {
            // increase elapsed time for sprite
            elapseTimeSeconds += deltaTime;

            // update position according to velocity
            position.add(velocity.x * deltaTime, velocity.y * deltaTime);
            // wrap around screen
            wrap(800,600); //todo... use a variable for screen width and height
        }

        public void render(GraphicsContext context) {
            context.save();

            context.translate(position.x, position.y);
            context.rotate(rotationInDegrees);
            context.translate(-image.getWidth()/2, -image.getHeight()/2);
            context.drawImage(image, 0,0);

            context.restore();
        }

    }

