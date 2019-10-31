import java.awt.*;

public class Square extends Figure {
    private int side;

    Square() {
        setName("Квадрат");
        side = random.nextInt(1000) + 1;
    }

    double getSide() {
        return side;
    }

    @Override
    public double calcSquare() {
        return Math.pow(side, 2);
    }

    public void paintShape(Graphics2D g2) {
        g2.setColor(getColor());
        g2.drawRect(50, 50, side, side);
        g2.fillRect(50, 50, side, side);
    }
}
