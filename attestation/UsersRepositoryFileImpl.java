import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UsersRepositoryFileImpl {

    //Метод для считывания списка пользователей из файла
    private Map<Integer, User> getUsersFromFile() throws FileNotFoundException {
        String inputFileName = "users.txt";
        Map<Integer, User> usersMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            reader.lines().forEach(line -> {
                User userFromTxt = new User(line);
                usersMap.put(userFromTxt.getId(), userFromTxt);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usersMap;
    }

    //метод ищет пользователя по ID
    public User findById(int id) throws FileNotFoundException {
        Map<Integer, User> usersFromFileMap = this.getUsersFromFile();
        return usersFromFileMap.getOrDefault(id, null);
    }

    //метод производит обновление данных пользователя
    public void update(User user) throws FileNotFoundException {
        Map<Integer, User> usersFromFileMap = getUsersFromFile();
        usersFromFileMap.put(user.getId(), user);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("users.txt"))) {
            StringBuilder text = new StringBuilder();
            usersFromFileMap.forEach((k, v) -> text.append(v.toString()));
            bw.write(String.valueOf(text));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //Метод возвращает всех пользователей
    public Map<Integer, User> getAllUsers() throws FileNotFoundException {
        return getUsersFromFile();
    }
}
