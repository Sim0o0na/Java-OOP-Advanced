package froggy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sim0o on 3/22/2017.
 */
public class Frog implements Iterator<Integer> {
    private List<Integer> list;
    private int index;

    public Frog(List<Integer> list){
        this.setList(list);
    }

    public void setList(List<Integer> list){
        this.list = list;
    }

    public void resetIndex(){
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        int temp = index;
        index+=2;
        return list.get(temp);
    }
}
