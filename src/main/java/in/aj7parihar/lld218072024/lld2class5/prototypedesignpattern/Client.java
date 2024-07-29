package in.aj7parihar.lld218072024.lld2class5.prototypedesignpattern;


import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // demoPrototype();
        demoRegistry();
    }

    public static void fillRegistry(StudentRegistry studentRegistry) {
        List<Integer> marks = new ArrayList<>();
        marks.add(45);
        marks.add(88);
        marks.add(90);


        Student st = new Student("Riddhi", 27, true, 76.2, marks);
        Student is = new IntelligentStudent("Rahul", 30, true, 89.4, marks, 140);
        Student cs = new CreativeStudent("Ajay", 29, true, 91.7, marks, 250);

        // add these object to registry
        studentRegistry.register(StudentType.STUDENT, st);
        studentRegistry.register(StudentType.INTELLIGENT_STUDENT, is);
        studentRegistry.register(StudentType.CREATIVE_STUDENT, cs);

    }

    public static void demoRegistry() {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        // Get the existing prototypes from the registry
        Student stPrototype = studentRegistry.get(StudentType.STUDENT);
        Student isPrototype = studentRegistry.get(StudentType.INTELLIGENT_STUDENT);
        Student csPrototype = studentRegistry.get(StudentType.CREATIVE_STUDENT);

        // Now making the copy of objects from the existing one in the registry
        Student stCopy = stPrototype.copy();
        Student isCopy = isPrototype.copy();
        Student csCopy = csPrototype.copy();

        System.out.println("DEBUG");
    }


    public static void demoPrototype() {
        List<Integer> marks = new ArrayList<>();
        marks.add(45);
        marks.add(88);
        marks.add(90);


        Student st = new Student("Riddhi", 27, true, 76.2, marks);
        Student st1 = st.copy();

        Student is = new IntelligentStudent("Rahul", 30, true, 89.4, marks, 140);
        Student is1 = is.copy();

        Student cs = new CreativeStudent("Ajay", 29, true, 91.7, marks, 250);
        Student cs1 = cs.copy();

        System.out.println("DEBUG");
    }
}
