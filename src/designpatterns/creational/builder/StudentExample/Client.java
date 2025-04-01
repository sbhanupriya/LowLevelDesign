package designpatterns.creational.builder.StudentExample;

public class Client {
    public static void main(String[] args){
        Director dir = new Director(new EngineeringStudent());
        System.out.println(dir.createStudent());

        Director dir2 = new Director(new MbaStudent());
        System.out.println(dir2.createStudent());
    }
}
