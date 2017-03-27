package list_iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

/**
 * Created by Sim0o on 3/21/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] command = reader.readLine().split(" ");
        ListyIterator listit = null;
        boolean created = false;

        while(!command[0].toLowerCase().equals("end")){
            switch (command[0].toLowerCase()) {
                case "create":
                    if (!created) {
                        String[] arguments = new String[command.length - 1];
                        for (int i = 0; i < command.length - 1; i++) {
                            arguments[i] = command[i + 1];
                        }
                        listit = new ListyIterator(arguments);
                        created = true;
                    }
                    break;
                case "move":
                    System.out.println(listit.move());
                    break;
                case "print":
                    try {
                        System.out.println(listit.print());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "hasnext":
                    System.out.println(listit.hasNext());
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }
            command = reader.readLine().split(" ");
        }
    }
}
