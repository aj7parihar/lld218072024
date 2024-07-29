package in.aj7parihar.lld218072024.lld2class5.clonemethod;

import java.util.List;

public class Student implements Cloneable{
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

    // By default 'clone()' will create a shallow copy but if we want deep copy then we can add
    // '@Override' it.
    // Adding '@Override' to create a deep copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
