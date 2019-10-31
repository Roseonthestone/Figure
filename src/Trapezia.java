import java.awt.*;

public class Trapezia extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

    Trapezia() {
        setName("Трапеция");
        topSide = random.nextInt(1000) + 1;
        bottomSide = random.nextInt(1000) + 1;
        height = random.nextInt(1000) + 1;
    }

    public int getTopSide() {
        return topSide;
    }

    public int getBottomSide() {
        return bottomSide;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double calcSquare() {
        return height * (topSide + bottomSide) / 2;
    }

    public void paintShape(Graphics2D g2) {
        g2.setColor(getColor());
        // g2.drawPolygon();
        System.out.println("Draw Triangle");
    }

}
