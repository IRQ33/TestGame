package org.irq3.WindowManager;

import com.raylib.Colors;

public class LoadAllTextures {

    private TextureLoader loader;

    public LoadAllTextures()
    {
        loader= new TextureLoader();
    }

    public void createBlocks(ObjectManager manager) {
        Object object = new Object(loader.makeandget("test"),200,200,0,3f, Colors.WHITE);

        manager.Add(object);

    }



}
