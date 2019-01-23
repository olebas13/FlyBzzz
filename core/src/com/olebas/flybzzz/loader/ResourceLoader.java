package com.olebas.flybzzz.loader;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import static com.badlogic.gdx.Gdx.*;
import static com.badlogic.gdx.Gdx.files;

public class ResourceLoader {

    private static TextureAtlas atlas;
    public static Sprite logo;
    public static Sprite flyAndSpiders;
    public static Sprite background;
    public static Sprite grass;
    public static Sprite fly1;
    public static Sprite fly2;
    public static Sprite fly3;
    public static Sprite spider;
    public static Sprite webUp;
    public static Sprite webDown;
    public static Sprite playButtonUp;
    public static Sprite playButtonDown;
    public static Sprite ready;
    public static Sprite retry;
    public static Sprite gameOver;
    public static Sprite scoreboard;
    public static Sprite starOn;
    public static Sprite starOff;
    public static Sprite highScore;
    public static Animation flyAnimation;
    public static Sound dead;
    public static Sound flap;
    public static Sound coin;
    public static Sound fall;
    public static Music fly;
    public static BitmapFont font;
    public static BitmapFont shadow;
    public static BitmapFont whiteFont;

    public static void load() {
        atlas = new TextureAtlas(files.internal("texture/texture.pack"), true);

        logo = new Sprite(atlas.findRegion("logo"));
        playButtonUp = new Sprite(atlas.findRegion("buttonOff"));
        playButtonDown = new Sprite(atlas.findRegion("buttonOn"));
        ready = new Sprite(atlas.findRegion("tapToFly"));
        retry = new Sprite(atlas.findRegion("retry"));
        gameOver = new Sprite(atlas.findRegion("gameOver"));
        scoreboard = new Sprite(atlas.findRegion("wood"));
        starOn = new Sprite(atlas.findRegion("starOn"));
        starOff = new Sprite(atlas.findRegion("starOff"));
        highScore = new Sprite(atlas.findRegion("highScore"));
        flyAndSpiders = new Sprite(atlas.findRegion("flyAndSpiders"));
        background = new Sprite(atlas.findRegion("background"));
        grass = new Sprite(atlas.findRegion("grass"));
        fly1 = new Sprite(atlas.findRegion("fly1"));
        fly2 = new Sprite(atlas.findRegion("fly2"));
        fly3 = new Sprite(atlas.findRegion("fly3"));
        spider = new Sprite(atlas.findRegion("spider"));
        webUp = new Sprite(atlas.findRegion("webUp"));
        webDown = new Sprite(atlas.findRegion("webDown"));

        TextureRegion[] fly = {fly1, fly2, fly3};
        flyAnimation = new Animation(0.06f, fly);
        flyAnimation.setPlayMode(Animation.PlayMode.LOOP_PINGPONG);

        dead = audio.newSound(files.internal("sounds/dead.wav"));
        flap = audio.newSound(files.internal("sounds/flap.wav"));
        coin = audio.newSound(files.internal("sounds/coin.wav"));
        fall = audio.newSound(files.internal("sounds/fall.wav"));
        ResourceLoader.fly = audio.newMusic(files.internal("sounds/fly.mp3"));

        font = new BitmapFont(files.internal("fonts/text.fnt"));
        font.getData().setScale(.25f, -.25f);
        whiteFont = new BitmapFont(files.internal("fonts/whitetext.fnt"));
        whiteFont.getData().setScale(.1f, -.1f);
        shadow = new BitmapFont(files.internal("fonts/shadow.fnt"));
        shadow.getData().setScale(.25f, -.25f);
    }

    public static void dispose() {
        atlas.dispose();

        dead.dispose();
        flap.dispose();
        coin.dispose();
        fly.dispose();

        font.dispose();
        shadow.dispose();
    }
}
