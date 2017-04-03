package database;

import javax.naming.OperationNotSupportedException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Sim0o on 4/3/2017.
 */
public class Main {
    public static void main(String[] args) throws OperationNotSupportedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] test = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        Database db = new Database(test);
        System.out.println(db.removeItem());
        db.addItem(5);
        System.out.println(db.removeItem());
        Integer[] fetch = db.fetch();
        for(Integer el: fetch){
            System.out.println(el);
        }
    }
}
