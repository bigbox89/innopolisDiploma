/*
На вход подается последовательность чисел, оканчивающихся на -1.
        Необходимо вывести число, которое присутствует в последовательности минимальное количество раз.
        Гарантируется:
        Все числа в диапазоне от -100 до 100.
        Числа встречаются не более 2 147 483 647-раз каждое.
        Сложность алгоритма - O(n)
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Homework07 {
    public static void main(String[] args) throws IOException {
        int num;
        int[] arrDigits = new int[100];
        int[] arrDubles = new int[100];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите последовательность чисел");
        int i = 0;
        int j = 0;
        num = Integer.parseInt(reader.readLine());
        while (num != -1) {
            arrDigits[i] = num;
            i++;
            num = Integer.parseInt(reader.readLine());
        }
        reader.close();
        System.out.println("Введенный массив: " + Arrays.toString(arrDigits));

        //создаем массив с количеством повторений, такой же размерности как и исходный
        for (int k = 0; k < arrDigits.length; k++) {
            arrDubles[k] = searchDublesInArray(arrDigits, arrDigits[k]);
        }

        System.out.println("Массив повторений: " + Arrays.toString(arrDubles));

        System.out.println("Число, которое присутствует в последовательности минимальное количество раз: " + arrDigits[findMinIndex(arrDubles)]);
    }
    /*
     * функция выводит подсчитывает количество повторений числа digit, в массиве arr
     * @param int [] arr
     * @param int digit
     */
    public static int searchDublesInArray(int[] arr, int digit) {
        int dubles = 0;
        for (int element : arr) {
            if (digit == element) dubles++;
        }
        return dubles;
    }

    /*
     * функция выводит находит минимальный элемент в массиве arr
     * @param int [] arr
     * @return int minIndex
     */
    public static int findMinIndex(int[] arr) {
        int minIndex = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}