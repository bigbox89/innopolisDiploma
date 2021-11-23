public class Homework05 {
    public static void main(String[] args) throws IOException {
        int num;
        int min = 9;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите последовательность чисел");
        num = Integer.parseInt(reader.readLine());
        while (num != -1) {
            while (num % 10 > 0) {
                if ((min > num % 10)) {
                    min = num % 10;
                }
                num = num / 10;
            }
            num = Integer.parseInt(reader.readLine());
        }
	System.out.println("Минимальная цифра последовательности:" + min);	
    }
}