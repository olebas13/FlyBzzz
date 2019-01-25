package com.olebas.flybzzz.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class GameWorld {

    private int midPointY;
    private int midPointX;

    public GameWorld(int midPointY, int midPointX) {
        this.midPointY = midPointY;
        this.midPointX = midPointX;
    }

    public void update(float delta) {
        Gdx.app.log("Game world update", "");
    }
}
