import java.awt.*;

public class Circle extends Figure {
    private int radius;

    Circle() {
        setName("Круг");
        radius = random.nextInt(1000) + 1;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double calcSquare() {
        return Math.PI * Math.pow(radius, 2);
    }


    public void paintShape(Graphics2D g2) {
        g2.setColor(getColor());
        g2.drawOval(50, 50, radius, radius);
        g2.fillArc(50, 50, radius, radius, 0, 360);
    }
}

