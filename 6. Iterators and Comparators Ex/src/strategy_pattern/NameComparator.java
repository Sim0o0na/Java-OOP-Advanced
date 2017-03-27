package strategy_pattern;

import java.util.Comparator;

/**
 * Created by Sim0o on 3/22/2017.
 */
public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if(p1.getName().length() == p2.getName().length()){
            if(p1.getName().toLowerCase().charAt(0) > p2.getName().toLowerCase().charAt(0)){
                return 1;
            }
            else if(p1.getName().toLowerCase().charAt(0) < p2.getName().toLowerCase().charAt(0)){
                return -1;
            }
            else{
                return 0;
            }
        }
        return p1.getName().length() - p2.getName().length();
    }
}
