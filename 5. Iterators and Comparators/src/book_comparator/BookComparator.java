package book_comparator;

import java.util.Comparator;

/**
 * Created by Sim0o on 3/21/2017.
 */
public class BookComparator implements Comparator<Book>
{
    @Override
    public int compare(Book o1, Book o2) {
       return o1.compareTo(o2);
    }
}
