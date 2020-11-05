import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashsetExample {

    public static void main(String[] args) {
        LinkedHashSet<Book> var = new LinkedHashSet<>();
        Book b1 = new Book(1,"Eloquent JavaScript","Marijn Haverbeke",350);
        Book b2 = new Book(2,"Programming Pearls","Jon Bentley",300);

        var.add(b1);
        var.add(b2);

        for (Book b : var)
        {
            System.out.println(b.getSlno() + " " + b.getNameofbook() + " " + b.getNameofauthor() + " " + b.getCost());
        }

        Iterator abc = var.iterator();


    }
}
