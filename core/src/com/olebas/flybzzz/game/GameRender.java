package com.olebas.flybzzz.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;

import java.util.WeakHashMap;

public class GameRender {

    private int midPointY;
    private int midPointX;

    private GameWorld mWorld;
    private OrthographicCamera camera;

    public GameRender(GameWorld world, int gameHeight, int midPointY, int midPointX) {
        mWorld = world;

        this.midPointY = midPointY;
        this.midPointX = midPointX;

        camera = new OrthographicCamera();
        camera.setToOrtho(true, 136, gameHeight);
    }

    public void render() {
        Gdx.app.log("GameRender render" , "");
    }
}
