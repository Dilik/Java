import java.util.*;

public class BookCompare implements Comparator<Book>{
    public int compare(Book one, Book two){
	return (one.title.compareTo(two.title));
    }
}

class Tree {
    public void go();
    Book b1 = new Book("How cats work");
    Book b2 = new Book("What is life");
    Book b3 = new Book("Flow");

    BookCompare bCompare = new BookCompare();
    TreeSet<Book> tree = new TreeSet<Book>(bCompare);
    tree.add(b1);
    tree.add(b2);
    tree.add(b3);

    System.out.println(tree);
}
