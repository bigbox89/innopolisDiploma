/**
 * ДЗ 16. Удаление элемента по индексу
 *
 * 45, 78, 10, 17, 89, 16, size = 6
 * removeAt(3)
 * 45, 78, 10, 89, 16, size = 5
 *  Реализовать метод T get(int index) для LinkedList
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
        //-------------------------------Linked List----------------------//
        LinkedList<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(120);
        list.add(-10);
        list.add(11);
        list.add(50);
        list.add(100);
        list.add(99);
        //Запрос элемента по индексу массива
        System.out.println( list.get(1));
    }


}
