import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> liste=new LinkedList<>();
        liste.add("Tubanur");
        liste.add("Balci");
        liste.add("Tubanur");
        liste.add("Java");
        liste.add("102");

        liste.remove(2);

        Iterator<String> itr=liste.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        for(String str:liste){//2.way
            System.out.println(str);
        }
    }
}