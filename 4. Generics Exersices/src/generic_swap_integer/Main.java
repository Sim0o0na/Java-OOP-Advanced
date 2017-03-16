package generic_swap_integer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Sim0o on 3/16/2017.
 */
public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Box> boxes = new ArrayList<>();
        while (n-->0){
            Box box = new Box(Integer.parseInt(reader.readLine()));
            boxes.add(box);
        }
        String[] indexes = reader.readLine().split("\\s+");
        swap(boxes,Integer.parseInt(indexes[0]),Integer.parseInt(indexes[1]));
        for(Box box:boxes){
            System.out.println(box.toString());
        }
    }
    public static List<?> swap(List<?> listche, int firstIndex, int secondIndex){
        Collections.swap(listche, firstIndex, secondIndex);
        return listche;
    }
}
