package custom_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sim0o on 3/16/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CustomList<? extends Comparable> listche = new CustomList<>();
        CommandInterpreter cmd = new CommandInterpreter();
        String[] command = reader.readLine().split("\\s+");
        while (!command[0].equals("END")){
            switch (command[0].toLowerCase()){
                case "add":
                    cmd.addElement(listche,command[1]);
                    break;
                case "remove":
                    cmd.remove(listche,Integer.parseInt(command[1]));
                    break;
                case "contains":
                    cmd.contains(listche, command[1]);
                    break;
                case "swap":
                    cmd.swap(listche, Integer.parseInt(command[1]),Integer.parseInt(command[2]));
                    break;
                case "greater":
                    cmd.greater(listche,command[1]);
                    break;
                case "max":
                    cmd.max(listche);
                    break;
                case "min":
                    cmd.min(listche);
                    break;
                case "print":
                    cmd.print(listche);
                case "sort":
                    cmd.sort(listche);
                case "end":
                    cmd.end();
            }
            command = reader.readLine().split("\\s+");
        }
    }
}
