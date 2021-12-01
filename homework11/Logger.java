import java.util.ArrayList;
    /*
    * Класс Logger, реализует паттерн Singelton
    */
public class Logger {
    private static final Logger instance;
    private ArrayList<String> messages;

    static{
        instance = new Logger();
    }

    private Logger() {
    messages = new ArrayList<String>();
    }

    public static Logger getLogger(){
        return instance;
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    public void log(String message){
        messages.add(message);
        System.out.println("Добавлено сообщение: " + message);
    }


}
