package equality_logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Sim0o on 3/22/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Person> treeSet = new TreeSet<>();
        HashSet<Person> hashSet = new HashSet<>();
        int n = Integer.parseInt(reader.readLine());
        while (n-- > 0) {
            String[] cmdArr = reader.readLine().split(" ");
            Person person = new Person(cmdArr[0], Integer.parseInt(cmdArr[1]));
            treeSet.add(person);
            hashSet.add(person);
        }

        System.out.println(treeSet.size());
        System.out.println(hashSet.size());
    }
}
