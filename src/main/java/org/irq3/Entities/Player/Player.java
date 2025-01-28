package org.irq3.Entities.Player;

import com.raylib.Raylib;
import org.irq3.Entities.Entity;

public class Player extends Entity {

    private Movement movement;

    public Player(int x, int y, float size, float rotation, Raylib.Texture texture, Movement movement) {
        super(x, y, size, rotation, texture);
        this.movement = movement;
    }




}
