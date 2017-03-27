package comparing_objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Sim0o on 3/22/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Person> people = new HashMap<>();
        String command = reader.readLine();

        int counter = 0;
        while(!command.equals("END")){
            counter++;
            String[] cmdArr = command.split(" ");
            Person person = new Person(cmdArr[0], Integer.parseInt(cmdArr[1]), cmdArr[2]);
            people.put(counter, person);
            command = reader.readLine();
        }

        int index = Integer.parseInt(reader.readLine());
        int equalPeople = 0;
        int nonEqualPeople = 0;

        Person toCompare = people.get(index);
        for(Person p:people.values()){
            if(p.compareTo(toCompare)==0){
                equalPeople++;
            }else{
                nonEqualPeople++;
            }
        }
        if(equalPeople!=1){
            System.out.println(String.format("%d %d %d", equalPeople, nonEqualPeople, people.size()));
        }else{
            System.out.println("No matches");
        }
    }
}
