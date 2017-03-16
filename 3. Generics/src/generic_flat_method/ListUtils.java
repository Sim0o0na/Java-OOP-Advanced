package generic_flat_method;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sim0o on 3/16/2017.
 */
public class ListUtils {
    public static <T extends Comparable> T getMax(List<T> list){
        if(list.isEmpty()){
            throw new IllegalArgumentException("List is empty");
        }
        T biggest = list.get(0);
        for(int i = 1; i<list.size(); i++){
            if(biggest.compareTo(list.get(i))<0){
                biggest=list.get(i);
            }
        }
        return biggest;
    }

    public static <T extends Comparable> T getMin(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0) {
                min = list.get(i);
            }
        }
        return min;
    }
    public static List<Integer> getNullIndices(List<?> list){
        List<Integer> indices = new ArrayList<>();
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) == null){
                indices.add(i);
            }
        }
        return indices;
    }

    public static <T> void flatten(List<? super T> destination, List<List<? extends T>> source){
        for (List<? extends T> inner:source) {
            destination.addAll(inner);
        }
    }
}
