package froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sim0o0na on 3/22/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] s = reader.readLine().split("[,\\s]+");
        List<Integer> numbers = new ArrayList<>();
        for(int k = 0; k < s.length; k++) {
            numbers.add(Integer.parseInt(s[k]));
        }
        String secondLine = reader.readLine();
        if(secondLine.equals("END")){
            Lake lake = new Lake(numbers);
            System.out.println(lake.getResult().toString().replace("[","").replace("]",""));
        }
    }
}
