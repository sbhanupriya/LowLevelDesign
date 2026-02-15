package designpatterns.creational.builder.gofWay.StudentExample;

public class Client {
    public static void main(String[] args){
        Director dir = new Director(new EngineeringStudent());
        System.out.println(dir.createStudent(1,"Bhanu"));

        System.out.println(dir.createStudent(2,"Aditya"));
    }
}
