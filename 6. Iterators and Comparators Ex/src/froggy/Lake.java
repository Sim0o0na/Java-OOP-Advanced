package froggy;

import java.util.*;

/**
 * Created by Sim0o on 3/22/2017.
 */
public class Lake implements Iterable<Integer> {
    private List<Integer> list;
    private List<Integer> result;
    private Frog frog;

    public Lake(List<Integer> nums) {
        this.setNumbers(nums);
        this.frog = new Frog(nums);
        this.result = new ArrayList<>();
    }

    @Override
    public Iterator<Integer> iterator() {
        return this.frog;
    }

    public List<Integer> getList(){
        return this.list;
    }

    public List<Integer> getResult() {
        for (Integer l : this) {
            this.result.add(l);
        }
        list.remove(0);
        this.setNumbers(list);
        frog.setList(list);
        frog.resetIndex();


        for (Integer l : this) {
            this.result.add(l);
        }

        return this.result;
    }

    public void setNumbers(List<Integer> numbers) {
        this.list = numbers;
    }
}
