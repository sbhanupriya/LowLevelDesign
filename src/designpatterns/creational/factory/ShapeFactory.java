package designpatterns.creational.factory;

import designpatterns.creational.factory.implementations.Circle;
import designpatterns.creational.factory.implementations.Rectangle;
import designpatterns.creational.factory.implementations.Square;

public class ShapeFactory {
    public Shape getShape(String type){
        switch(type){
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            case "circle":
                return new Circle();
            default:
                return null;
        }
    }
}
