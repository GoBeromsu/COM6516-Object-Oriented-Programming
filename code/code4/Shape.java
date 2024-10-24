package code4; /**
 * Shape.java
 * <p>
 * A simple class used in week 4 to implement an abstract superclass
 *
 * @version 1.1 26 August 2011
 * @author Richard Clayton  (r.h.clayton@sheffield.ac.uk)
 */

import sheffield.*;

public abstract class Shape implements Drawable {

    // instance fields
    // these could be implemented as protected (as shown in the lecture notes)
    // or more safely as private, with getX and getY methods as shown here
    private int x;
    private int y;

    public Shape() {
        this(0, 0);
    }

    public Shape(int x, int y) {
        setPosition(x, y);
    }

    public void setPosition(int xval, int yval) {
        x = xval;
        y = yval;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract int area();
}
