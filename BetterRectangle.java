/**
 * Makes the rectangle class better.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.Rectangle;
class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height) {
        super.setLocation(x, y);
        super.setSize(width, height);
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public double getArea() {
        return getWidth() * getHeight();
    }
}
