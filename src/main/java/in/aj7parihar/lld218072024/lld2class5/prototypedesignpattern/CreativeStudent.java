package in.aj7parihar.lld218072024.lld2class5.prototypedesignpattern;

import java.util.List;

public class CreativeStudent extends Student {
    private int cq;

    public CreativeStudent(String name, int age, boolean isActive, double psp, List<Integer> marks, int cq) {
        super(name, age, isActive, psp, marks);
        this.cq = cq;
    }

    public CreativeStudent(CreativeStudent student) {
        super(student);
        this.cq = student.cq;
    }

    @Override
    public CreativeStudent copy(){
        return new CreativeStudent(this);
    }
}
