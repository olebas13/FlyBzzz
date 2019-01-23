package com.olebas.flybzzz.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.olebas.flybzzz.FlyBzzz;
import com.olebas.flybzzz.loader.ResourceLoader;

import aurelienribon.tweenengine.TweenManager;

import static com.badlogic.gdx.Gdx.graphics;

public class SplashScreen implements Screen {

    private TweenManager manager;
    private SpriteBatch batch;
    private Sprite sprite;
    private FlyBzzz game;

    public SplashScreen(FlyBzzz game) {
        this.game = game;
    }

    @Override
    public void show() {
        sprite = new Sprite(ResourceLoader.logo);
        sprite.setColor(1, 1, 1, 0);
        float width = graphics.getWidth();
    }

    @Override
    public void render(float delta) {

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
