/*
 * Class Ellipse потомок класса Circle
 * @param radius - радиус 1 = радиус 2
 * @return Perimetr = (2 * Math.PI * Math.sqrt((radius1*radius1 + radius2*radius2 / 2))
 * */
public class Circle extends Ellipse {

    public Circle(int radius) {
        super(radius, radius);
    }

    public int getRadius() {
        return getRadius1();
    }
}
