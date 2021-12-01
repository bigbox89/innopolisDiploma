        /*
        На вход подается информация о людях в количестве 10 человек (имя - строка, вес - вещественное число).
        Считать эти данные в массив объектов.
        Вывести в отсортированном по возрастанию веса порядке.
        */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Homework08 {
    public static void main(String[] args) throws IOException {
        int i = 0, j = 0, k = 0, minWeightindex = 0;
        float minWeight = 1000.0f;
        Human humansArr[] = new Human[10];
        Human tempHuman = new Human();

        System.out.println("Программа ввода с консоли информации о людях.");
        System.out.println("Вводите сначал Имя, затем Вес.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //чтение с консоли информации о людях
        while (i < humansArr.length) {
            humansArr[i] = new Human();
            System.out.println("Введите имя " + (i + 1) + " -го человека:");
            humansArr[i].setName(reader.readLine());
            System.out.println("Введите вес " + (i + 1) + " -го человека:");
            humansArr[i].setWeight(Float.parseFloat(reader.readLine()));
            i++;
        }
        reader.close();
        System.out.println(Arrays.toString(humansArr));

        //сортировка массива с людьми
        while (j < humansArr.length) {
            for (k = j; k < humansArr.length; k++) {
                if (humansArr[k].getWeight() < minWeight) {
                    minWeight = humansArr[k].getWeight();
                    minWeightindex = k;
                }
            }
            minWeight = 1000.0f;
            tempHuman = humansArr[j];
            humansArr[j] = humansArr[minWeightindex];
            humansArr[minWeightindex] = tempHuman;
            j++;
        }
        System.out.println(Arrays.toString(humansArr));
    }
}
