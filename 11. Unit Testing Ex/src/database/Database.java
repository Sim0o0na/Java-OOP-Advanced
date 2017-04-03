package database;

import javax.naming.OperationNotSupportedException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

/**
 * Created by Sim0o on 3/31/2017.
 */
public class Database {
    private static final int ITEMS_CAPACITY = 16;
    private Integer[] items;
    private int internalIndex = 0;

    public Database(Integer... items) throws OperationNotSupportedException {
        this.setItems(items);
        this.internalIndex = items.length;
    }

    public void addItem(Integer item) throws OperationNotSupportedException {
        if(item==null){
            throw new OperationNotSupportedException("Item cannot be null");
        }
        else if(internalIndex>ITEMS_CAPACITY){
            throw new OperationNotSupportedException("Database is full");
        }
        this.items[internalIndex] = item;
        internalIndex++;
    }

    public Integer removeItem() throws OperationNotSupportedException {
        if(internalIndex==-1){
            throw new OperationNotSupportedException("Database is empty");
        }
        internalIndex--;
        Integer lastElement =  this.items[internalIndex];
        this.items[internalIndex] = null;
        return lastElement;
    }
    public Integer[] fetch(){
        return this.items;
    }

    private void setItems(Integer... items) throws OperationNotSupportedException {
        if(items.length>ITEMS_CAPACITY){
            throw new OperationNotSupportedException("Array is longer than 16 elements");
        }
        for(Integer el:items){
            if(el==null){
                throw new OperationNotSupportedException("Item cannot be null");
            }
        }
        this.items = Arrays.copyOf(items,ITEMS_CAPACITY);
    }
}
