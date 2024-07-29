package in.aj7parihar.lld218072024.lld2class5.clonemethod;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        try{
            demoClone();
        }catch(CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }
    }
    public static void demoClone() throws CloneNotSupportedException {
        List<Student> students = new ArrayList<Student>();
        List<Student> studentsCopy = new ArrayList<>();

        List<Integer> marks = new ArrayList<>();
        marks.add(40);
        marks.add(50);
        marks.add(60);

        // marksCopy will be a Deep Copy
        List<Integer> marksCopy = new ArrayList<>();
        for (Integer mark : marks) {
            marksCopy.add(mark);
        }

        Student st = new Student("Riddhi", 27, true, 60.0, marks);
        students.add(st);

        Student st1 = (Student) st.clone();
        studentsCopy.add(st1);

        marks.add(70);


        System.out.println("DEBUG");
    }
}
