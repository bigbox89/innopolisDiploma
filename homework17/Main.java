import java.util.Map;
import java.util.TreeMap;

/**
 * ДЗ 17. Удаление элемента по индексу
 * На вход подается строка с текстом. Необходимо посчитать, сколько встречается раз каждое слово в этой строке.
 * <p>
 * Вывести:
 * Слово - количество раз
 * <p>
 * Использовать Map, string.split(" ") - для деления текста по словам. Слово - символы, ограниченные пробелами справа и слева.
 */
public class Main {
    public static void main(String[] args) {
        //На вход подается строка с текстом
        String inputString = "На На вход подается строка с текстом На вход подается строка с текстом Необходимо посчитать сколько встречается раз каждое слово в этой строке";
        Map<String, Integer> words = new TreeMap<>();
        String[] listWords = inputString.split(" ");
        int count = 0;
        System.out.println("Подсчет количества повторяющихся слов в строки при помощи интерфейса Map");
        //Делаем проход по массиву и считаем сколько раз повторяется слово.
        //Затем добавляем все в Map с уникальными ключами
        for (String listWord : listWords) {
            count = 0;
            for (String s : listWords) {
                if (s.equals(listWord)) {
                    count++;
                }
            }
            words.put(listWord, count);
        }
        System.out.println(words.toString());


    }


}
