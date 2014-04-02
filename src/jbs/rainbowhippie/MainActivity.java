package jbs.rainbowhippie;

import android.os.Bundle;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.math.Vector2;

import core.EntitySpawner;
import core.Game;
import core.RainbowHippie;

public class MainActivity extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useGL20 = false;
        
        Game game = new Game() {
        	@Override public void create() {
        		shouldPlayIntro = false;
        		super.create();
        		Game.activeGame.resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
                RainbowHippie.usesTouchControls = true;
        	}
        };
        
        initialize(game, cfg);
    }
}