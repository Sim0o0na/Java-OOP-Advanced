package strategy_pattern;

import java.util.Comparator;

/**
 * Created by Sim0o on 3/22/2017.
 */
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAge()>o2.getAge()){
            return 1;
        }
        else if (o1.getAge()<o2.getAge()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
