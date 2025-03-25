package designpatterns.creational.factory.Shapes;

public class ShapeSimulator {
    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();
        Shape shape =  factory.getShape("circle");
        shape.draw();
        shape =  factory.getShape("square");
        shape.draw();
        shape =  factory.getShape("rectangle");
        shape.draw();
    }
}
