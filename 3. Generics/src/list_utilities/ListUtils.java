package list_utilities;

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

    public static <T extends Comparable> T getMin(List<T> list){
        if(list.isEmpty()){
            throw new IllegalArgumentException("List is empty");
        }
        T min = list.get(0);
        for(int i = 1; i<list.size(); i++){
            if(min.compareTo(list.get(i))>0){
                min=list.get(i);
            }
        }
        return min;
    }
}
