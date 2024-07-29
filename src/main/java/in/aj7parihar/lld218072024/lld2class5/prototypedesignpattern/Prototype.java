package in.aj7parihar.lld218072024.lld2class5.prototypedesignpattern;

public interface Prototype<T> {
    // Making it generic <T> so that it can return the base class based on the prototype object
    T copy();
}
