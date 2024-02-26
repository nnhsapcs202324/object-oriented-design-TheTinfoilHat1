import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TriangleComponent extends JComponent {
    private static final int MAX_POINTS = 3;
    private int pointCount;
    private Point2D.Double[] points;

    public TriangleComponent() {
        points = new Point2D.Double[MAX_POINTS];
        MyMouseListener listener = new MyMouseListener(); // Create an instance of the listener
        this.addMouseListener(listener); // Add the listener to the component
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        drawShapes(g2);
    }

    private void drawShapes(Graphics2D g2) {
        // Draw the dots and lines based on the points array
        if (pointCount >= 1) {
            // Draw the first dot
            double x = points[0].getX();
            double y = points[0].getY();
            Ellipse2D.Double dot = new Ellipse2D.Double(x - 2, y - 2, 4, 4); // Create a small dot
            g2.fill(dot); // Fill the dot
        }
        if (pointCount >= 2) {
            // Draw a line between the first two points
            double x1 = points[0].getX();
            double y1 = points[0].getY();
            double x2 = points[1].getX();
            double y2 = points[1].getY();
            Line2D.Double line = new Line2D.Double(x1, y1, x2, y2); // Create a line
            g2.draw(line); // Draw the line
        }
        if (pointCount == 3) {
            // Draw the entire triangle
            double x1 = points[0].getX();
            double y1 = points[0].getY();
            double x2 = points[1].getX();
            double y2 = points[1].getY();
            double x3 = points[2].getX();
            double y3 = points[2].getY();
            
            // Draw lines between all three points to form a triangle
            Line2D.Double line1 = new Line2D.Double(x1, y1, x2, y2);
            Line2D.Double line2 = new Line2D.Double(x2, y2, x3, y3);
            Line2D.Double line3 = new Line2D.Double(x3, y3, x1, y1);
            
            g2.draw(line1);
            g2.draw(line2);
            g2.draw(line3);
        }
    }

    // Inner class implementing MouseListener
    private class MyMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            // Handle mouse click event
            if (pointCount < MAX_POINTS) {
                points[pointCount] = new Point2D.Double(e.getX(), e.getY());
                pointCount++;
                System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
                repaint(); // Redraw the component
            } else {
                // Reset if the maximum number of points is reached
                pointCount = 0;
                points = new Point2D.Double[MAX_POINTS];
                repaint(); // Redraw the component
            }
        }

        // Other methods of MouseListener interface 
        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }
}