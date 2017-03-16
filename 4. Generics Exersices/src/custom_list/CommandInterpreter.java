package custom_list;

import java.util.List;

/**
 * Created by Sim0o on 3/16/2017.
 */
public class CommandInterpreter<T extends Comparable> {
    public void addElement(CustomList<T> list,T element){
        list.add(element);
    }
    public void remove(CustomList<T> list,int index){
        list.remove(index);
    }
    public void contains(CustomList<T> list,T element){
        System.out.println(list.contains(element));
    }
    public void swap(CustomList<T> list,int firstIndex, int secondIndex){
        list.swap(firstIndex,secondIndex);
    }
    public void greater(CustomList<T> list, T element){
        System.out.println(list.countGreaterThan(element));
    }
    public void max(CustomList<T> list){
        System.out.println(list.getMax());
    }
    public void min(CustomList<T> list){
        System.out.println(list.getMin());
    }
    public void print(CustomList<T> list){
        for(T el:list){
            System.out.println(el);
        }
    }
    public void sort(CustomList<T> list){
        Sorter sorter = new Sorter();
        sorter.sort(list);
    }
    public boolean end(){
        return false;
    }
}
