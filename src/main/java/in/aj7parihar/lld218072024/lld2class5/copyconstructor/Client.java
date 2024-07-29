package in.aj7parihar.lld218072024.lld2class5.copyconstructor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoCopyConstructor();
    }
    public static void demoCopyConstructor() {
        List<Student> students = new ArrayList<>();
        List<Student> studentsCopy = new ArrayList<>();

        List<Integer> marks = new ArrayList<>();
        marks.add(45);
        marks.add(88);
        marks.add(90);

        Student st = new Student("Riddhi", 27, true, 76.2, marks);
        Student is = new IntelligentStudent("Rahul", 30, true, 89.4, marks, 140);
        Student cs = new CreativeStudent("Ajay", 29, true, 91.7, marks, 250);

        students.add(st);
        students.add(is);
        students.add(cs);

        // Now creating a copy
        // Initially in debug mode it looked like it is  deep copy because of immutable and primitive
        // data type but when we created a list (mutable data type) and in the end added "marks.add(99)"
        // the changes to the list was reflected in this copy also.
        // hence it is SHALLOW COPY.
        for (Student student : students) {
            Student stCopy = null;
            if(student instanceof IntelligentStudent) {
                IntelligentStudent isCopy = (IntelligentStudent) student;
                stCopy = new IntelligentStudent(isCopy);
            }else if(student instanceof CreativeStudent) {
                CreativeStudent csCopy = (CreativeStudent) student;
                stCopy = new CreativeStudent(csCopy);
            }else{
                stCopy = new Student(student);
            }
            studentsCopy.add(stCopy);
        }

        // st2 is referring to same object in heap. st3 is shallow copy of st
        Student st2 = st;
        Student st3 = new Student(st);

        marks.add(99);
        marks.set(0, 60);
        System.out.println("DEBUG");
    }
}
