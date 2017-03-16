package border_control;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Citizen implements Habitant {
    private String name;
    private String id;
    private int age;

    public Citizen(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }
}
