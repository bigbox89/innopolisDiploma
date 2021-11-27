/*
* Сделать класс Figure, у данного класса есть два поля - x и y координаты.
Классы Ellipse и Rectangle должны быть потомками класса Figure.
Класс Square - потомок класса Rectangle, Circle - потомок класса Ellipse.
В классе Figure предусмотреть метод getPerimeter(), который возвращает 0. Во всех остальных классах он должен возвращать корректное значение.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет периметра геометрических фигур");
        Circle circle = new Circle(4);
        Square square = new Square(5);
        System.out.println("Периметр круга, с радиусом " + circle.getRadius() + " = " + circle.getPerimeter());
        System.out.println("Периметр квадрата, со стороной " + square.getStorona() + " = " + square.getPerimeter());
    }
}
