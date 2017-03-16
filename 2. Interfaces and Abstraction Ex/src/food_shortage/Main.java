package food_shortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.HashMap;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        HashMap<String, Buyer> names = new HashMap<>();
        while (n-->0){
            String command = reader.readLine();
            String[] cmdArr = command.split("\\s+");
            switch (cmdArr.length){
                case 4:
                    Citizen citizen = new Citizen(cmdArr[0], Integer.parseInt(cmdArr[1]), cmdArr[2], cmdArr[3]);
                    names.put(citizen.getName(), citizen);
                    break;
                case 3:
                    Rebel rebel = new Rebel(cmdArr[0], Integer.parseInt(cmdArr[1]), cmdArr[2]);
                    names.put(rebel.getName(), rebel);
                    break;
            }
        }

        String name = reader.readLine();
        while (!name.equals("End")){
            if(names.containsKey(name)){
                names.get(name).BuyFood();
            }
            name = reader.readLine();
        }
        System.out.println(names.values().stream().mapToInt(b->b.getFood()).sum());
    }
}
