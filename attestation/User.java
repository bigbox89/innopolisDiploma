public class User {
    private int id, age;
    private boolean isClient;
    private String name;

    public User(int id, String name, int age, boolean isClient) {
        this.id = id;
        this.age = age;
        this.isClient = isClient;
        this.name = name;
    }

    //создаем пользователя из строки в текстовом файле
    public User(String line) {
        String[] userLine = line.split("\\|");
        this.id = Integer.parseInt(userLine[0]);
        this.name = userLine[1];
        this.age = Integer.parseInt(userLine[2]);
        this.isClient = Boolean.parseBoolean(userLine[3]);
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isClient() {
        return isClient;
    }

    public void setClient(boolean client) {
        isClient = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + "|" + name + "|" + age + "|" + isClient + System.lineSeparator();
    }
}
