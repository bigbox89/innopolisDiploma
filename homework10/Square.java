/*
 * Class Sqare потомок класса Rectangle
 * @param radius - радиус 1 = радиус 2
 * @return Perimetr = 2*(storona1+storona2)
 * */
public class Square extends Rectangle{

    public Square() {
    }

    public String showName(){
        return ("Квадрат");
    }
    public Square(int storona) {
        super(storona, storona);
    }

    public int getStorona(){
        return this.getStorona1();
    }
}
