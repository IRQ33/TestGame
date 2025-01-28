package org.irq3.WindowManager;

import com.raylib.Colors;
import org.irq3.Game;

public class LoadAllTextures {

    private final TextureLoader loader;
    private final Game game;

    public LoadAllTextures( Game game)
    {
        this.game = game;
        loader= new TextureLoader();
    }

    public void createBlocks(ObjectManager manager) {


        manager.Add(
               new Object(loader.makeandget("test"),200,200,0,3f, Colors.WHITE)
        );
        manager.Add(
               new Object( loader.makeandget("player.png"),game.player.getX(),game.player.getY(), game.player.getRotation(),game.player.getScale(),game.player.getColors())
        );

    }



}
