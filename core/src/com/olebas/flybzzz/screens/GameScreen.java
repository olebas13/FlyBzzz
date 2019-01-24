package com.olebas.flybzzz.screens;

import com.badlogic.gdx.Screen;
import com.olebas.flybzzz.game.GameRender;
import com.olebas.flybzzz.game.GameWorld;

public class GameScreen implements Screen {

    private GameWorld world;
    private GameRender renderer;

    public GameScreen() {
        world = new GameWorld(world);
        renderer = new GameRender();
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
