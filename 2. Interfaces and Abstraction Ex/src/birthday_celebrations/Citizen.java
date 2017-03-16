package birthday_celebrations;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Citizen implements Habitant {
    private String name;
    private String id;
    private int age;
    private String birthday;


    public Citizen(String name, int age, String id, String birthday){
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }
}
