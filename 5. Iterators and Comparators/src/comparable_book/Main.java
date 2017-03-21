package comparable_book;

/**
 * Created by Sim0o on 3/21/2017.
 */
public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        if (bookTwo.compareTo(bookThree) > 0) {
            System.out.println(String.format("%s is before %s", bookTwo, bookThree));
        } else if (bookTwo.compareTo(bookThree) < 0) {
            System.out.println(String.format("%s is before %s", bookThree, bookTwo));
        } else {
            System.out.println("Book are equal");
        }

    }
}
