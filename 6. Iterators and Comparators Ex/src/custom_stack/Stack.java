package custom_stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Sim0o on 3/21/2017.
 */
public class Stack<Integer> implements Iterable<Integer> {
    private List<Integer> elements;
    private int internalIndex = -1;

    public Stack() {
        this.elements = new ArrayList<>();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int secondIndex = internalIndex;
            @Override
            public boolean hasNext() {
                if (secondIndex >= 0) {
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                return elements.get(secondIndex--);
            }
        };
    }
    public Integer pop() {
        if (elements.size() > 0) {
            Integer last = elements.get(elements.size() - 1);
            elements.remove(elements.size() - 1);
            this.internalIndex--;
            return last;
        }
        throw new ArrayIndexOutOfBoundsException("No elements");
    }

    public void push(Integer... newElements) {
        for (Integer el : newElements) {
            elements.add(el);
            this.internalIndex++;
        }
    }

    public String printAll() {
        StringBuilder sb = new StringBuilder();
        for (Integer el : this) {
            sb.append(String.format("%s%n", el));
        }
        return sb.toString();
    }

    public List<Integer> getElements(){
        return Collections.unmodifiableList(this.elements);
    }

}
