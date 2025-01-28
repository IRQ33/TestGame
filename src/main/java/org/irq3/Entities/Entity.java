package org.irq3.Entities;

import com.raylib.Colors;
import com.raylib.Raylib;
import org.irq3.WindowManager.Object;

public class Entity extends Object {
    int x,y;
    float size,rotation;
    Raylib.Texture texture;


    public Entity(int x, int y, float size, float rotation, Raylib.Texture texture) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.rotation = rotation;
        this.texture = texture;
    }
    public Object getEntityObject()
    {
        return new Object(
                texture, x,y, rotation, size, Colors.WHITE
        );
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    public Raylib.Texture getTexture() {
        return texture;
    }

    public void setTexture(Raylib.Texture texture) {
        this.texture = texture;
    }
}
