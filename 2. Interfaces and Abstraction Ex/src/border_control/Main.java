package border_control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String command = reader.readLine();

        List<String> ids = new ArrayList<>();
//        HashMap<String, Habitant> habitants = new HashMap<>();
        while (!command.equals("End")){
            String[] cmdArr = command.split("\\s+");
            switch (cmdArr.length){
                case 3:
                    Habitant citizen = new Citizen(cmdArr[0], Integer.parseInt(cmdArr[1]), cmdArr[2]);
                    ids.add(citizen.getId());
                    break;
                case 2:
                    Habitant robot = new Robot(cmdArr[0], cmdArr[1]);
                    ids.add(robot.getId());
                    break;
            }
            command = reader.readLine();
        }
        String fake = reader.readLine();

        for(String id:ids){
            if(id.substring(id.length()-fake.length(), id.length()).equals(fake)){
                System.out.println(id);
            }
        }
    }
}
