import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //result array
        ArrayList<Figure> resultFigureSet = new ArrayList<>();

        //array of names
        ArrayList<String> myFigureNames = new ArrayList<>(Arrays.asList("Triangle", "Circle", "Square", "Trapezia"));
        int maxLengthResultArray = 45;
        for (int i = 0; i <= (maxLengthResultArray); i++) {
            int j = (int) (Math.random() * myFigureNames.size());
            Class randomClass = Class.forName(myFigureNames.get(j));
            Figure randomFigure = (Figure) randomClass.newInstance();
            resultFigureSet.add(randomFigure);
        }

        //checking
        for (Figure figure : resultFigureSet) {
            System.out.println(figure.getInfo());
        }

        Circle myCircle = new Circle();
        myCircle.draw();
    }
}
