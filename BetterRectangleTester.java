
/**
 * Write a description of class BetterRectangleTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BetterRectangleTester
{
    public static void main(String[] args) {
        BetterRectangle rect = new BetterRectangle(0, 0, 5, 10);

        // Test getPerimeter and getArea methods
        double perimeter = rect.getPerimeter();
        double area = rect.getArea();

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
   