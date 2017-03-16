package custom_list;

import java.util.*;

/**
 * Created by Sim0o on 3/16/2017.
 */
public class CustomList<T extends Comparable> implements GenericDataStructure<T>, Iterable<T>{
    private List<T> content;

    public CustomList(){
        this.content = new ArrayList<>();
    }

    public List<T> getContent(){
        return this.content;
    }
    @Override
    public void add(T element) {
        this.content.add(element);
    }

    @Override
    public T remove(int index) {
        T toReturn = this.content.get(index);
        this.content.remove(index);
        return toReturn;
    }

    @Override
    public boolean contains(Comparable element) {
        if(this.content.contains(element)){
            return true;
        }
        return false;
    }

    @Override
    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(this.content, firstIndex, secondIndex);
    }

    @Override
    public int countGreaterThan(Comparable element) {
        int count = 0;
        for(Comparable el:this.content){
            if (el.compareTo(element)>0){
                count++;
            }
        }
        return count;
    }

    @Override
    public T getMax() {
        T max = this.content.get(0);
        for(int i = 1; i<this.content.size(); i++){
            if(this.content.get(i).compareTo(max)>0){
                max = this.content.get(i);
            }
        }
        return max;
    }

    @Override
    public T getMin() {
        T min = this.content.get(0);
        for(int i = 1; i<this.content.size(); i++){
            if(this.content.get(i).compareTo(min)<0){
                min = this.content.get(i);
            }
        }
        return min;
    }

    @Override
    public Iterator iterator() {
        Iterator<T> iter = this.content.iterator();
        return iter;
    }
}
