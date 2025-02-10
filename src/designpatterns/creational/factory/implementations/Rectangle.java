package designpatterns.creational.factory.implementations;

import designpatterns.creational.factory.Shape;

public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Rectangle");
    }
}
