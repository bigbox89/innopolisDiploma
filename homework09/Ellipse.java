/*
 * Class Ellipse потомок класса Figure
 * @param radius1 - радиус 1
 * @param radius2 - радиус 2
 * @return Perimetr = (2 * Math.PI * Math.sqrt((radius1*radius1 + radius2*radius2 / 2))
 * */
public class Ellipse extends Figure {
    private int radius1;
    private int radius2;

    public Ellipse(int radius1, int radius2) {
        super();
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    public int getRadius1() {
        return radius1;
    }

    public int getRadius2() {
        return radius2;
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * Math.sqrt((radius1 * radius1 + radius2 * radius2) / 2));
    }
}
