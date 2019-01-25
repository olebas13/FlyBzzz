package com.olebas.flybzzz.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.olebas.flybzzz.game.GameRender;
import com.olebas.flybzzz.game.GameWorld;

public class GameScreen implements Screen {

    private GameWorld world;
    private GameRender renderer;

    public GameScreen() {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenHeight / gameWidth);
        int midPointY = (int) (gameHeight / 2);
        int midPointX = (int) (gameWidth / 2);

        world = new GameWorld(midPointY, midPointX);
        renderer = new GameRender(world, (int) gameHeight, midPointY, midPointX);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        world.update(delta);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
