package Library;

import java.util.Iterator;

/**
 * Created by Sim0o on 3/21/2017.
 */
public class Library<Book> implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books){
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }
    private final class LibIterator implements Iterator<Book> {
        private int counter = 0;

        public boolean hasNext(){
            if(this.counter<books.length){
                return true;
            }
            return false;
        }

        public Book next(){
            counter++;
            return books[counter-1];
        }
    }

}
