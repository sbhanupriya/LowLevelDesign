package designpatterns.creational.factory.Shapes;

import designpatterns.creational.factory.Shapes.implementations.Circle;
import designpatterns.creational.factory.Shapes.implementations.Rectangle;
import designpatterns.creational.factory.Shapes.implementations.Square;

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
