package custom_list;

/**
 * Created by Sim0o on 3/16/2017.
 */
public interface GenericDataStructure<T extends Comparable>
{
    void add(T element);
    T remove(int index);
    boolean contains(T element);
    void swap(int firstIndex, int secondIndex);
    int countGreaterThan(T element);
    T getMax();
    T getMin();
}
