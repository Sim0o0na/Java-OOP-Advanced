package collection;

import java.util.Iterator;

/**
 * Created by Sim0o on 3/21/2017.
 */
public class ListyIterator implements Iterable<String>, Iterator<String> {
    private String[] elements;
    private int internalIndex = 0;

    public ListyIterator(String... elements) {
        this.elements = elements;
    }

    public int getInternalIndex() {
        return internalIndex;
    }

    @Override
    public Iterator<String> iterator() {
        return this;
    }

    public boolean hasNext() {
        if (this.internalIndex < elements.length - 1) {
            return true;
        }
        return false;
    }

    public boolean move() {
        if (hasNext()) {
            internalIndex++;
            return true;
        } else {
            return false;
        }
    }

    public String next() {
        internalIndex++;
        return elements[internalIndex];
    }

    public String print() {
        if (elements.length == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        return elements[internalIndex];
    }

    public String printAll() {
        StringBuilder sb = new StringBuilder();
        if (elements.length == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        int count = 0;
        while (count<elements.length) {
            sb.append(String.format("%s ", elements[count]));
            count++;
        }
        return sb.toString();
    }
}

