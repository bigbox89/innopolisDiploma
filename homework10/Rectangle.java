/*
 * Class Rectangle потомок класса Figure
 * @param storona1 - длина стороны 1
 * @param storona2 - длина стороны 2
 * @return Perimetr = 2*(storona1+storona2)
 * */

public class Rectangle extends Figure {
    private int storona1;
    private int storona2;

    public Rectangle() {
      super();
    }

    public Rectangle(int storona1, int storona2) {
        super();
        this.storona1 = storona1;
        this.storona2 = storona2;
    }

    public int getStorona1() {
        return storona1;
    }

    public int getStorona2() {
        return storona2;
    }

    @Override
    public double getPerimeter() {
        return (2 * (storona1 + storona2));
    }
}
