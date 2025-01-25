package org.irq3.WindowManager;


import static com.raylib.Raylib.*;


public class Object {
    private int x,y;
    private float rotation,scale;
    private Color colors;
    private Texture texture;

    public Object(Texture texture, int x, int y, float rotation, float scale, Color colors) {
        this.texture = texture;
        this.x = x;
        this.y = y;
        this.rotation = rotation;
        this.scale = scale;
        this.colors = colors;

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

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public Color getColors() {
        return colors;
    }

    public void setColors(Color colors) {
        this.colors = colors;
    }

    public Texture getTexture() {
        return texture;
    }


}
