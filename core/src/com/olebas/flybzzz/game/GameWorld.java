package com.olebas.flybzzz.game;

import com.badlogic.gdx.Gdx;

public class GameWorld {

    private GameWorld mWorld;

    public GameWorld(GameWorld world) {
        mWorld = world;
    }

    public void update(float delta) {
        Gdx.app.log("Game world update", "");
    }
}
