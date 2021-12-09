/**
 * ДЗ 16. Удаление элемента по индексу
 *
 * 45, 78, 10, 17, 89, 16, size = 6
 * removeAt(3)
 * 45, 78, 10, 89, 16, size = 5
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(78);
        numbers.add(10);
        numbers.add(17);
        numbers.add(89);
        numbers.add(16);
        System.out.println(numbers.toString());
        numbers.removeAt(3);
        System.out.println("Removed element with index = 3");
        System.out.println(numbers.toString());

    }


}
