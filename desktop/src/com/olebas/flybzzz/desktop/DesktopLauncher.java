package com.olebas.flybzzz.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.olebas.flybzzz.FlyBzzz;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new FlyBzzz(), config);
		config.title = "Fly Bzzz";
		config.width = 360;
		config.height = 640;
	}
}
