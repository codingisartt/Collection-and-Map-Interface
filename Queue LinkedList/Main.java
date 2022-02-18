import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>(); //Polymorphism
        q.add("Tubanur");
        q.add("Balci");

        q.offer("Patika");

        q.remove(); // it deletes from first

        System.out.println(q.element()); // it gives first element
        System.out.println(q.poll()); // it gives firs and deletes
        System.out.println("###########");
        Iterator<String> itr=q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}