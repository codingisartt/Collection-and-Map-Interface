import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //TreeSet<Student> students =new TreeSet<>(new OrderNoteComparator().reversed()); 

        TreeSet<Student> students =new TreeSet<>(new OrderNameComparaor().reversed());

        students.add(new Student("Mustafa",20));
        students.add(new Student("Ahmet",80));
        students.add(new Student("Mehmet",60));
        students.add(new Student("Didem",60));
        students.add(new Student("Cem",70));
        students.add(new Student("Zeynep",100));

        for(Student st:students){
            System.out.println(st.getName());
        }
    }
}
