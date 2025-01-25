package org.irq3;

import com.glowiak.librlimg.ImageLoader;
import com.raylib.Raylib;
import org.irq3.Helpers.GVector;
import org.irq3.WindowManager.LoadAllTextures;
import org.irq3.WindowManager.Object;
import org.irq3.WindowManager.ObjectManager;
import org.irq3.WindowManager.TextureLoader;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static com.raylib.Raylib.*;
import static com.raylib.Colors.*;
import static com.raylib.Raylib.DrawTextureEx;

public class Game {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int MAX_FPS = 144;
    public static final String GAMENAME= "New game";
    public static final String VERSION = "0.1";

    TextureLoader loader;
    ObjectManager manager;
    LoadAllTextures textures;
    File savedir;



    public void run(){
        init();
        loader = new TextureLoader();
        manager = new ObjectManager();
        textures= new LoadAllTextures();

        textures.createBlocks(manager);

        while (!WindowShouldClose())
        {
            Loop();
        }
        CloseWindow();


    }

    public final void init()
    {
        InitWindow(WIDTH, HEIGHT, GAMENAME+ " "+ VERSION);
        SetTargetFPS(MAX_FPS);
        savedir = new File(System.getProperty("user.home")+File.separator+"newGame");

       // SetWindowState(2);

    }


    public final void Loop()
    {
        BeginDrawing();
        ClearBackground(SKYBLUE);

        Vector2 vector2 = new Vector2();
        vector2.x(300);
        vector2.y(300);


        DrawText("Alpha 0.1", 10, 10, 20, WHITE);
        DrawText(GetFPS()+"", 10, 35, 20, WHITE );


        for (Object object : manager.getObjects())
        {
            DrawTextureEx(object.getTexture(),
                    GVector.makeVector(object.getX(),object.getY()), object.getRotation(),
                    object.getScale(),object.getColors());
        }


        EndDrawing();
    }

}
