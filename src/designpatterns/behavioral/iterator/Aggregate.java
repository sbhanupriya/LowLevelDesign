package designpatterns.behavioral.iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
