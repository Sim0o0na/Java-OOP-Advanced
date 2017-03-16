package jar;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Sim0o on 3/16/2017.
 */
public class Jar<T> {
    private Deque<T> content;
    public Jar(){
        this.content = new ArrayDeque<T>();
    }

    public void add(T element){
        this.content.add(element);
    }

    public T remove(){
        return this.content.pop();
    }
}
