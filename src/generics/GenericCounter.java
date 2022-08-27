package generics;

public class GenericCounter<T> {

    T t;

    public GenericCounter(T t) {
        this.t = t;
    }

    public void print() {
        System.out.println(t);
    }
}