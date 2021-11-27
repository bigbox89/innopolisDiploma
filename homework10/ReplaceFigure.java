/*
* Static Интерфейс, который позволит перемещать фигуру на заданные координаты
* @param Figure figure - исходная геометрическая фигура
* @param int moveX - число, на которое перемещаем координату X
* @param int moveX - число, на которое перемещаем координату Y
* */
public interface ReplaceFigure {

    public static void replaceWithCoordintes(Figure figure, int moveX, int moveY){
        figure.setCoordX(figure.getCoordX() + moveX);
        figure.setCoordY(figure.getCoordY() + moveY);
    }
}
