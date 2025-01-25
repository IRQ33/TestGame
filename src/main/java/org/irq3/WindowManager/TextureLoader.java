package org.irq3.WindowManager;

import com.glowiak.librlimg.ImageLoader;
import com.raylib.Raylib;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

public class TextureLoader {
    HashMap<String, Raylib.Texture> textureHashMap;

    public TextureLoader()
    {
        textureHashMap = new HashMap<>();
    }


    public void add(String name)  {
        textureHashMap.put(name, ImageLoader.getTextureFromJar("/"+name+".png"));
    }

    public Raylib.Texture makeandget(String name) {
        textureHashMap.put(name, ImageLoader.getTextureFromJar("/"+name+".png"));
        return ImageLoader.getTextureFromJar("/"+name+".png");
    }
    public Raylib.Texture get(String name) {
        return ImageLoader.getTextureFromJar("/"+name+".png");
    }


}
