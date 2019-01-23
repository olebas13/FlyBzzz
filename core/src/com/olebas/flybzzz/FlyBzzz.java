package com.olebas.flybzzz;

import com.badlogic.gdx.Game;
import com.olebas.flybzzz.loader.ResourceLoader;
import com.olebas.flybzzz.screens.SplashScreen;

public class FlyBzzz extends Game {

	@Override
	public void create () {
		ResourceLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		ResourceLoader.dispose();
	}
}
