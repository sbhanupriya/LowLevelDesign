package designpatterns.creational.objectpool;

public class DBConnection {
    private static int counter = 1;
    private int index;
    public DBConnection(){
        index = counter;
        System.out.println("Creating db connection " + counter++);
    }
    public void task(){
        System.out.println("Index " + index);
    }
}
