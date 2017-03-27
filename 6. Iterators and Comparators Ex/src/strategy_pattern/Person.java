package strategy_pattern;

/**
 * Created by Sim0o on 3/22/2017.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.compareTo(o.name) > 0) {
            return 1;
        } else if (this.name.compareTo(o.name) < 0) {
            return -1;
        } else if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }
        return this.name.compareTo(o.name);
    }
}

