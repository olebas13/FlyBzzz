package com.olebas.flybzzz.objects;

import com.badlogic.gdx.math.Vector2;

public class Fly {

    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private float rotation;
    private int width;
    private float height;

    public Fly(float x, float y, int width, int height) {
        this.width = width;
        this.height = height;

        position = new Vector2(x, y);
        velocity = new Vector2(0, 0);
        acceleration = new Vector2(0, 460);
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public float getRotation() {
        return rotation;
    }

    public int getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public void update(float delta) {
        velocity.add(acceleration.cpy().scl(delta));

        if (velocity.y > 200) {
            velocity.y = 200;
        }

        position.add(velocity.cpy().scl(delta));
    }
}
