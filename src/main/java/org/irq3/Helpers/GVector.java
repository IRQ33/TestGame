package org.irq3.Helpers;

import com.raylib.Raylib;

public class GVector {

    public static  Raylib.Vector2 makeVector(int x, int y)
    {
        Raylib.Vector2 vector2 = new Raylib.Vector2();
        vector2.x(x);
        vector2.y(y);
        return vector2;

    }
}
