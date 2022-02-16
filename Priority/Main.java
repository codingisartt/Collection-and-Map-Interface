import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue <String> q=new PriorityQueue<>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
            
        }.reversed());

        q.add("Tubanur");
        q.add("Yusuf");
        q.add("Aysegül");
        q.add("Salih");
        
        for(String s:q){
            System.out.println(s);
        }
    }
}