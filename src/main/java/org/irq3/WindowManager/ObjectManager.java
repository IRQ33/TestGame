package org.irq3.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class ObjectManager {

    List<Object> objects = new ArrayList<>();


    public void Add(Object object)
    {
        objects.add(object);
    }
    public void Remove(Object object)
    {
        objects.remove(object);
    }
    public List<Object> getObjects()
    {
        return objects;
    }

}
