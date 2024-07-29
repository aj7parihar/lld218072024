package in.aj7parihar.lld218072024.lld2class5.copyconstructor;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private boolean isActive;
    private double psp;
    private List<Integer> marks;

    public Student(String name, int age, boolean isActive, double psp, List<Integer> marks) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
        this.psp = psp;
        this.marks = marks;
    }

    // Copy Constructor
    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.isActive = student.isActive;
        this.psp = student.psp;
        this.marks = student.marks;
    }
}
