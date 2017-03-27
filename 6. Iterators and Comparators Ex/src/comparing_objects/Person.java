package comparing_objects;

import java.util.Comparator;

/**
 * Created by Sim0o on 3/22/2017.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
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
        return this.town.compareTo(o.town);
    }
}

