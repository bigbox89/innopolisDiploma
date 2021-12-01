/*
* Сделать класс Logger с методом void log(String message), который выводит в консоль какое-либо сообщение.
* Применить паттерн Singleton для Logger.
*/
public class Program {
    public static void main(String[] args) {
        System.out.println("Программа для работы с классом Singelton");
        Logger logger1 = Logger.getLogger();
        logger1.log("Пишем первое сообщение в лог");
        Logger logger2 = Logger.getLogger();
        logger2.log("Пишем второе сообщение в лог");
        Logger logger3 = Logger.getLogger();
        System.out.println("Выводим сообщения из логгера: " + logger3.getMessages().toString());
    }
}
