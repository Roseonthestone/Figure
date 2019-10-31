import java.awt.*;

public class Triangle extends Figure {
    private int catet_1;
    private int catet_2;

    private double hipotenuse;

    public Triangle() {
        setName("Треугольник");
        catet_1 = random.nextInt(1000) + 1;
        catet_2 = random.nextInt(1000) + 1;
        setHipotenuse();
    }

    public void setHipotenuse() {
        hipotenuse = calcHipotenuse();
    }


    public double calcHipotenuse() {
        return Math.sqrt(Math.pow(catet_1, 2) + Math.pow(catet_2, 2));
    }

    public int getCatet_1() {
        return catet_1;
    }

    public int getCatet_2() {
        return catet_2;
    }

    public double getHipotenuse() {
        return Math.round(hipotenuse * 10) / 10;
    }

    @Override
    public double calcSquare() {
        return catet_1 * catet_2 / 2;
    }

    public void paintShape(Graphics2D g2) {
        g2.setColor(getColor());
        // g2.drawPolygon();
        System.out.println("Draw Triangle");

    }

}
