package P01_ExtendedArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ExtendedArrayList<E extends Comparable<E>> extends ArrayList<E>{

    public E max(){
        Iterator<E> iterator = this.iterator();
        E max = null;
        while(iterator.hasNext()){
            E element = iterator.next();
            if(max==null||element.compareTo(max)>0){
                max=element;
            }
        }
        return max;
    }

    public E min(){
        Iterator<E> iterator = this.iterator();
        E min = null;
        while(iterator.hasNext()){
            E element = iterator.next();
            if(min==null||element.compareTo(min)<0){
                min=element;
            }
        }
        return min;
    }
}
