package custom_list;

import java.util.Collections;

/**
 * Created by Sim0o on 3/16/2017.
 */
public class Sorter<T extends Comparable> {
    public void sort(CustomList<T> list) {
        Collections.sort(list.getContent(), (a,b)->a.compareTo(b));
    }
}
