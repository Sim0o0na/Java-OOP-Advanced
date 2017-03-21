package tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sim0o on 3/17/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = reader.readLine().split("\\s+");
        String firstArg = new StringBuilder(firstLine[0] + " "+firstLine[1]).toString();
        Tuple<String, String> firstPair = new Tuple<>(firstArg, firstLine[2]);
        System.out.println(firstPair.toString());

        String[] secondLine = reader.readLine().split("\\s+");
        Tuple<String, Integer> secondPair = new Tuple<>(secondLine[0], Integer.parseInt(secondLine[1]));
        System.out.println(secondPair.toString());

        String[] thirdLine = reader.readLine().split("\\s+");
        Tuple<Integer, Double> thirdPair = new Tuple<>(Integer.parseInt(thirdLine[0]),
                Double.parseDouble(thirdLine[1]));
        System.out.println(thirdPair.toString());
    }
}
