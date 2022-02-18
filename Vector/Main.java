import java.util.Iterator;
import java.util.Vector;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("İstanbul");
        vector.add("Erzurum");
        vector.add("Kütahya");
        vector.add("Bingöl");
        vector.add("İzmir");
        vector.add("Sakarya");

        vector.add(2, "Bolu");
        System.out.println(vector.contains("Bolu"));//true

        Iterator<String> itr=vector.iterator();
        /*while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
        for(String str:vector){//2.way
            System.out.println(str);
        }

    }
}