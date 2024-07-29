package in.aj7parihar.lld218072024.lld2class5.prototypedesignpattern;

import java.util.List;

public class Student implements Prototype<Student> {
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
        // for 'super' to work in sub classes, we can not make this private
        this.name = student.name;
        this.age = student.age;
        this.isActive = student.isActive;
        this.psp = student.psp;
        this.marks = student.marks;
    }

    @Override
    public Student copy(){
        return new Student(this);
        // 'this' refers to current object
        // return new Student(this) will call copy constructor to construct the copy of the current object.
    }
}
