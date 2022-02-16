import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>(); //default capasity is 10.

        liste.add(10);
        liste.add(7);
        liste.add(null);
        liste.add(2);
        liste.add(7);
        liste.add(46);
        liste.add(24);
        liste.add(48);

        liste.add(2, 25);//**** good property

        System.out.println("Lİst size: "+liste.size());
        System.out.println(liste.get(1)); // 1.index: 7
        System.out.println(liste.set(6, 36)); //36 printed instead of 46
        System.out.println(liste.lastIndexOf(7)); //5 
        

        System.out.println(liste.contains(10)); //true
        liste.remove(8); //index 8 is removed.

        System.out.println(liste);//1.way

        List<Integer> liste2=new ArrayList<>();
        liste2.addAll(liste);
        liste2.add(98);
        System.out.println(liste2);

        List<Integer> liste3=liste.subList(5, 8);
        System.out.println(liste3);

        Object[] objectArr= liste.toArray(); //new array
        Integer[] intgr=liste.toArray(new Integer[0]);
        System.out.println(intgr[0]);


        Iterator<Integer> itr=liste.iterator(); //2.way
        /* while(itr.hasNext()){
            System.out.println(itr.next());
        } */
        /* for(Integer element:liste){ //3.way
            System.out.println(element);
        } */
    }
}