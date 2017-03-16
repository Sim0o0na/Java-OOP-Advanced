package array_creator;

import java.lang.reflect.Array;

/**
 * Created by Sim0o on 3/16/2017.
 */
public class ArrayCreator {
    public static <T> T[] create(int len, T element){
        T[] array = (T[]) new Object[len];
        for(int i = 0; i < len; i++){
            array[i] = element;
        }
        return array;
    }

    public static <T> T[] create(Class<T> cl,int len, T element){
        T[] array = (T[]) Array.newInstance(cl,len);
        for(int i = 0; i < len; i++){
            array[i] = element;
        }
        return array;
    }
}

