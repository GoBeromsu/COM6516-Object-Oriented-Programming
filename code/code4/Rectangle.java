package code4;/*
 * Rectangle.java  1.0 26/08/2011
 *
 * Copyright (c) University of Sheffield 2011
 */

/**
 * Rectangle.java
 * <p>
 * A simple class used in week 4 to implement a Rectangle subclass
 *
 * @version 1.1 26 August 2011
 * @author Richard Clayton  (r.h.clayton@sheffield.ac.uk)
 */

import sheffield.*;

import java.awt.*;

public class Rectangle extends Shape {

    private int width, height;

    public Rectangle(int x, int y, int w, int h) {
        super(x, y);
        width = w;
        height = h;
    }

    public int area() {
        return width * height;
    }

    public void draw(EasyGraphics g) {
        g.moveTo(getX(), getY());
        g.lineTo(getX() + width, getY());
        g.lineTo(getX() + width, getY() + height);
        g.lineTo(getX(), getY() + height);
        g.lineTo(getX(), getY());
    }

}
