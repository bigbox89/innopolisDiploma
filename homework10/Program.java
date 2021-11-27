/*
*Сделать класс Figure из задания 09 абстрактным.
Определить интерфейс, который позволит перемещать фигуру на заданные координаты.
Данный интерфейс должны реализовать только классы Circle и Square.
В Main создать массив "перемещаемых" фигур и сдвинуть все их в одну конкретную точку.
*/
public class Program {
    public static void main(String[] args) {
        System.out.println("Перемещение геометрических фигур");
        Figure arr[] = new Figure[20];
        for (int i = 0; i < arr.length; i++) {
            //создаем по очереди, то круг, то квадрат
            arr[i] = i % 2 == 0 ? new Circle() : new Square();
            //перемещаем фигуры в указанную точку
            ReplaceFigure.replaceWithCoordintes(arr[i], 112, 34);
            //выводим координаты на печать
            arr[i].paint();
        }

    }
}
