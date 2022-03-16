import java.util.Arrays;

/**
 * Предусмотреть функциональный интерфейс
 * interface ByCondition {
 * boolean isOk(int number);
 * }
 * Реализовать в классе Sequence метод:
 * public static int[] filter(int[] array, ByCondition condition) {
 * ...
 * }
 * Данный метод возвращает массив, который содержит элементы, удовлетворяющиие логическому выражению в condition.
 * В main в качестве condition подставить:
 * <p>
 * - проверку на четность элемента
 * - проверку, является ли сумма цифр элемента четным числом.
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("ДЗ №13. Применение функциональных интерфейсов для сортировки массивов по условию");
        int[] arr = new int[100];
        addElementsToArr(arr);
        System.out.println("Проверка числа на четность");
        System.out.println(Arrays.toString(Sequence.filter(arr, n -> n % 2 == 0)));
        System.out.println();
        System.out.println("Проверка суммы цифр числа на четность");
        System.out.println(Arrays.toString(Sequence.filter(arr, n -> {
            int sum = 0;
            while (n % 10 > 0) {
                sum += n % 10;
                n = n / 10;
            }
            return sum % 2 == 0;
        })));
    }

    private static void addElementsToArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.abs(Math.random() * 100.0);
        }
    }

}
