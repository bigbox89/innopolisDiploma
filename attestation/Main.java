import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        UsersRepositoryFileImpl usersData = new UsersRepositoryFileImpl();
        System.out.println("Программа для работы с файлом пользователей");
        System.out.println(usersData.getAllUsers());

        System.out.println("Вывод пользователя по ID = 1");
        System.out.println(usersData.findById(1));

        System.out.println("Обновление данных пользователя с ID = 1");
        User userForUpdate = usersData.findById(1);

        userForUpdate.setName("Марсель");
        userForUpdate.setAge(27);
        usersData.update(userForUpdate);
        System.out.println(usersData.getAllUsers());
    }
}
