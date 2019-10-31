import javax.swing.*;
import java.awt.*;

public class Graph extends JFrame {
    private Figure shape;

    public Graph(Figure figure) {
        super(figure.getName());
        shape = figure;
        setBounds(50, 50, 1000, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //automatically called by JGraph constructor
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        shape.paintShape(g2);

    }
}

