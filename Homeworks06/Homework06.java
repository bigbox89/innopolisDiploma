import java.util.Arrays;
import java.util.Scanner;

/*
    Реализовать функцию, принимающую на вход массив и целое число.
    Данная функция должна вернуть индекс этого числа в массиве.
    Если число в массиве отсутствует - вернуть -1.
        Реализовать процедуру, которая переместит все значимые элементы влево, заполнив нулевые, например:
        было:
        34, 0, 0, 14, 15, 0, 18, 0, 0, 1, 20
        стало
        34, 14, 15, 18, 1, 20, 0, 0, 0, 0, 0
*/
public class Homework06 {
    public static void main(String[] args) {
        int size = 0;
        int j = 0;
        int digitForSearch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("              Поиск индекса числа в массиве.");
        System.out.println("Введите количество элементов в массиве.");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива.");

        int element = sc.nextInt();
        while (j < size) {
            arr[j] = element;
            j++;
            if (j < size) element = sc.nextInt();
        }
        System.out.println("Для поиска индекса введите число");
        digitForSearch = sc.nextInt();
        sc.close();
        findIndex(arr, digitForSearch);
        replaceNulls(arr);
    }
    /*
     * функция выводит индекс искомого элемента в массиве
     * @param int [] arr
     * @param int digitForSearch
     * */
    public static void findIndex(int[] arr, int digitForSearch) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if ((digitForSearch == arr[i])) {
                index = i;
                break;
            }
        }
        System.out.println("Индекс числа " + digitForSearch + " в массиве: " + index + " " + Arrays.toString(arr));
    }
/*
* функция перемещает все значимые элемент влево, заменив нулями
* @param массив int
* */
    public static void replaceNulls(int[] arr) {
        int j = 0;
        while (checkAllNulls(arr))
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    if (i < arr.length - 1) {
                        arr[i] = arr[i + 1];
                        arr[i + 1] = 0;
                    }
                }
            }
        System.out.println("Массив с нулями в конце: " + Arrays.toString(arr));
    }
    /*
     *функция проверяет массив на нахождение всех нулей в массиве, в конце массива
     *@param int [] arr
     *@return boolean result
     */
    public static boolean checkAllNulls(int[] arr) {
        boolean result = false;
        int numNulls = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) numNulls++;
        }
        for (int a = arr.length - numNulls; a < arr.length; a++) {
            if (arr[a] != 0) result = true;
        }
        return result;
    }
}
