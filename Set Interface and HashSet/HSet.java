import java.util.HashSet;
import java.util.Iterator;

public class HSet {//It does not allow the same elements to be found again in the dataset.
    public static void main(String[] args) {

        // f(x) = x*3 * xmod7 * sqrt(x)

        HashSet<String> hSet = new HashSet<>();
        hSet.add("a");
        hSet.add("b");
        hSet.add("z");
        hSet.add(null);

        hSet.remove("b");
        System.out.println(hSet.size());
        System.out.println(hSet.contains("b"));
        for (String s : hSet) {
            System.out.println(s);
        }

        // Navigate using Iterator 
        Iterator<String> itr = hSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("##########");
        // Navigate using for-each
        for(String s:hSet){
            System.out.println(s);

        }
    }
}
