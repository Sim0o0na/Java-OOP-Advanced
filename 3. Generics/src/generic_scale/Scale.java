package generic_scale;

import java.util.Collection;

/**
 * Created by Sim0o on 3/16/2017.
 */
public class Scale<T extends Comparable> {
    private T left;
    private T right;
    public Scale(T left, T right){
        this.left = left;
        this.right = right;
    }

    public T getHeavier(){
        if(this.left.compareTo(right)<0){
            return right;
        }
        else if(this.left.compareTo(right)>0){
            return left;
        }
        return null;
    }
}
