package strategy_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.TreeSet;

/**
 * Created by Sim0o on 3/22/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Person> byName = new TreeSet<>(new NameComparator());
        TreeSet<Person> byAge = new TreeSet<>(new AgeComparator());
        int n = Integer.parseInt(reader.readLine());
        while (n-- > 0) {
            String[] cmdArr = reader.readLine().split(" ");
            Person person = new Person(cmdArr[0], Integer.parseInt(cmdArr[1]));
            byAge.add(person);
            byName.add(person);
        }

        byName.forEach(p -> {
            System.out.printf("%s %d\n", p.getName(), p.getAge());
        });
        byAge.forEach(p -> {
            System.out.printf("%s %d\n", p.getName(), p.getAge());
        });
    }
}
