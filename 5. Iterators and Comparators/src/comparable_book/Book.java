package comparable_book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sim0o0na on 3/21/2017.
 */
public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    private void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    private void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    private void setAuthors(String... authors){
        if(authors.length==0){
            this.authors = new ArrayList<String>();
        }else{
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    public List<String> getAuthors(){
        return this.authors;
    }

    @Override
    public int compareTo(Book o) {
        if(this.getTitle().compareTo(o.getTitle())==0){
           if(this.getYear()>o.getYear()){
               return 1;
           }else if(this.getYear()<o.getYear()){
               return -1;
           }else{
               return 0;
           }
        }
        return this.getTitle().compareTo(o.getTitle());
    }

    @Override
    public String toString(){
        return this.getTitle();
    }
}
