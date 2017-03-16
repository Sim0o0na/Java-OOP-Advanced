package birthday_celebrations;

import javax.swing.text.DateFormatter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String command = reader.readLine();

        List<String> birthdays = new ArrayList<>();
        //LocalDate.parse(string, formatter);
//        HashMap<String, Habitant> habitants = new HashMap<>();
        while (!command.equals("End")){
            String[] cmdArr = command.split("\\s+");
            switch (cmdArr.length){
                case 5:
                    Habitant citizen = new Citizen(cmdArr[1], Integer.parseInt(cmdArr[2]), cmdArr[3], cmdArr[4]);
                    birthdays.add(cmdArr[4]);
                    break;
                case 3:
                    if(cmdArr[0].equals("Pet")){
                        Pet pet = new Pet(cmdArr[1], cmdArr[2]);
                        birthdays.add(cmdArr[2]);
                    }
                    if(cmdArr[0].equals("Robot")) {
                        Habitant robot = new Robot(cmdArr[1], cmdArr[2]);
                    }
                    break;
            }
            command = reader.readLine();
        }
        String year = reader.readLine();

        for(String birthday:birthdays){
            String[] birthArr = birthday.split("/");
            if(birthArr[2].equals(year)){
                System.out.println(birthday);
            }

        }
    }
}
