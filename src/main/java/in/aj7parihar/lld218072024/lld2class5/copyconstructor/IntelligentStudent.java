package in.aj7parihar.lld218072024.lld2class5.copyconstructor;

import java.util.List;

public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(String name, int age, boolean isActive, double psp, List<Integer> marks, int iq) {
        super(name, age, isActive, psp, marks); // calling parent class constructor first
        this.iq = iq; // then initializing my own attribute
    }

    public IntelligentStudent(IntelligentStudent student) {
        super(student); // calling my parent class copy constructor
        this.iq = student.iq; // then initializing my own attribute
    }
}
