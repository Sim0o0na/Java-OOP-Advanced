package warning_levels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Sim0o on 3/23/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String loggerLevel = reader.readLine();
        Logger logger = new Logger(Importance.valueOf(loggerLevel));

        String command = reader.readLine();
        while (!command.equals("END")){
            String messageLevel = command.substring(0, command.indexOf(":"));
            String content = command.substring(command.indexOf(":")+2);
            logger.recordMessage(new Message(Importance.valueOf(messageLevel), content));
            command = reader.readLine();
        }

        for(Message message:logger.getMessages()){
            System.out.println(message.toString());
        }
    }
}
