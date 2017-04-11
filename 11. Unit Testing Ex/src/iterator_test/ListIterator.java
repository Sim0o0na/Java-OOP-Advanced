package iterator_test;

import javax.naming.OperationNotSupportedException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Sim0o on 4/3/2017.
 */
public class ListIterator<T extends String> implements Iterable<String> {
    private T[] elements;
    private int internalIndex  = 0;

    public ListIterator(T... elements) throws OperationNotSupportedException {
        this.setElements(elements);
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>(){
            @Override
            public boolean hasNext() {
                if(internalIndex<elements.length-1){
                    return true;
                }
                return false;
            }

            @Override
            public T next() {
                internalIndex++;
                return elements[internalIndex];
            }
        };
    }

    public boolean move(){
        if (this.iterator().hasNext()) {
            internalIndex++;
            return true;
        } else {
            return false;
        }
    }

    private void setElements(T... elements) throws OperationNotSupportedException {
        if(elements==null || elements.length==0) {
           throw new OperationNotSupportedException("Input array is empty!");
        }
        this.elements = Arrays.copyOf(elements, elements.length);
    }

    public int getInternalIndex(){
        return this.internalIndex;
    }

    public String print() {
        if (elements.length == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        return elements[internalIndex];
    }
}
