package custom_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sim0o on 3/21/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] command = reader.readLine().split(" ");
        Stack<Integer> customStack = new Stack<>();
        try {
            while (!command[0].toLowerCase().equals("end")) {
                switch (command[0].toLowerCase()) {
                    case "pop":
                        customStack.pop();
                        break;
                    case "push":
                        Integer[] arguments = new Integer[command.length - 1];
                        for (int i = 0; i < command.length - 1; i++) {
                            arguments[i] = Integer.parseInt(command[i + 1].replace(",", ""));
                        }
                        customStack.push(arguments);
                        break;
                    default:
                        System.out.println("Invalid operation!");
                        break;
                }
                command = reader.readLine().split(" ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.print(customStack.printAll());
        System.out.print(customStack.printAll());
    }
}
