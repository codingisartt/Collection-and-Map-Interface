import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Set<Book> books=new HashSet<>(new OrderByNameComparable());
        TreeSet <Book> bookset=new TreeSet<>();
        Book book1=new Book("Hayvan Çiftliği", 328, "George Orwell", 1949);
        Book book2=new Book("Iki Şehrin Hikayesi", 500, "Charles Dickens", 1859);//if first letter tr character, gets to the end of the list.
        Book book3=new Book("Küçük Prens", 96, "Antoine de Saint-Exupéry", 1943);
        Book book4=new Book("On Küçük Zenci", 192, "Agatha Christie", 1939);
        Book book5=new Book("Kızıl Köşkün Rüyası", 150, "Cao Xueqin", 1791);

        bookset.add(book1);
        bookset.add(book2);
        bookset.add(book3);
        bookset.add(book4);
        bookset.add(book5);
        for(Book bk:bookset){
            System.out.printf("Book Name: %-23s Page: %4d\n", bk.getName(), bk.getPageNumber());
            //System.out.println("Book Name: "+bk.getName()+"\nPage: "+bk.getPageNumber());
        }
        System.out.println("=====Ordered Book List=======");
        TreeSet <Book> pageset=new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()-o2.getPageNumber();
            }
            
        }.reversed());

        pageset.add(book1);
        pageset.add(book2);
        pageset.add(book3);
        pageset.add(book4);
        pageset.add(book5);

        for (Book b : pageset) {
            System.out.println("Book Name: "+b.getName()+"  Page: "+b.getPageNumber());
        }
    }
}
