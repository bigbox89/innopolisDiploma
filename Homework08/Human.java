
import java.util.Objects;

public class Human {

    private String name;
    private float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Человек{" +
                "по имени'" + name + '\'' +
                ", вес:" + weight +
                '}';
    }
}
