package designpatterns.behavioral.iterator;

public interface Iterator<T> {
    T next();
    boolean hasNext();
}
