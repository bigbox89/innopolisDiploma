/*
 * Class Figure
 * @param coordX - координата X
 * @param coordY - координата Y
 * @return Perimetr
 * */
public abstract class Figure {
    private int coordX = 0;
    private int coordY = 0;

    public Figure() {
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public String showName(){
        return ("Фигура");
    }

    public void paint(){
        System.out.println("Фигура " + showName() + " имеет следующие координаты: по оси X - " + this.getCoordX() + " по оси Y - " + this.getCoordY() );
    }
    //абстрактный метод для расчета периметра, должен быть реализован у всех потомков
    abstract double getPerimeter();

}
