package in.aj7parihar.lld218072024.lld2class5.prototypedesignpattern;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private final Map<StudentType, Student> registry = new HashMap<StudentType, Student>();

    // to register/store new object
    public void register(StudentType prototypeName, Student prototypeObject) {
        registry.put(prototypeName, prototypeObject);
    }

    // to fetch the object
    public Student get(StudentType prototypeName) {
        return registry.get(prototypeName);
    }

}
