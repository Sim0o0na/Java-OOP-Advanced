package generic_count_method_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Sim0o on 3/16/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Box> boxes = new ArrayList<>();
        while(n-->0){
           Box box = new Box(reader.readLine());
            boxes.add(box);
        }
        System.out.println(getGreater(boxes, reader.readLine()));
    }
    public static int getGreater(List<Box> list, String var){
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getContent().compareTo(var)>0){
                count++;
            }
        }
        return count;
    }
}
