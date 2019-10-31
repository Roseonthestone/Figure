import java.awt.*;
import java.util.*;


public abstract class Figure {
    public static Random random = new Random();
    private static ArrayList<Color> colors = new ArrayList(Arrays.asList(Color.MAGENTA, Color.BLACK, Color.YELLOW, Color.BLUE, Color.ORANGE));
    public Map<Color, String> colorMAP = new HashMap<Color, String>();
    //Properties
    private String name;
    private Color color;

    //Constructors
    public Figure() {

        colorMAP.put(Color.MAGENTA, "magenta");
        colorMAP.put(Color.BLACK, "черный");
        colorMAP.put(Color.YELLOW, "желтый");
        colorMAP.put(Color.BLUE, "голубой");
        colorMAP.put(Color.ORANGE, "оранжевый");
        color = getRandomColor();
    }

    public Figure(Color color) {
        this.color = color;
    }

    public static Color getRandomColor() {
        return colors.get(random.nextInt(colors.size()));

    }

    //Getters
    public double getSquare() {
        return Math.round(calcSquare() * 100) / 100;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    //Other methods
    public void draw() {
        new Graph(this);
        System.out.println(name + "  is painting");
    }

    public abstract void paintShape(Graphics2D g2);

    public abstract double calcSquare();

    public String getInfo() {
        return "Фигура: " + getName() + ", площадь: " + getSquare() + " ед., цвет: " + colorMAP.get(getColor());
    }

}
