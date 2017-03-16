package generic_add_all_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Sim0o on 3/16/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1,2,3);

        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles, 1.2,2.5,3.4);

        List<Number> destination = new ArrayList<>();
        ListUtils.addAll(destination, doubles);
        ListUtils.addAll(destination, integers);
        System.out.println(destination);
    }
}
