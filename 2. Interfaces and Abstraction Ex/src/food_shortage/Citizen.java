package food_shortage;

import inteface_person.Person;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Citizen implements Habitant, Human, Buyer {
    private String name;
    private String id;
    private int age;
    private String birthday;
    private int food;


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

    @Override
    public void BuyFood() {
        this.setFood(this.getFood()+10);
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public void setFood(int food) {
        this.food=food;
    }
}
