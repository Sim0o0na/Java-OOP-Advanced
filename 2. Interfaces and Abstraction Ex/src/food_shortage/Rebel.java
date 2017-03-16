package food_shortage;

/**
 * Created by Sim0o on 3/15/2017.
 */
public class Rebel implements Human, Buyer {
    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void BuyFood() {
        this.setFood(this.getFood()+5);
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
