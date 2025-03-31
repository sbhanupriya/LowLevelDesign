package designpatterns.creational.builder;

public class BuilderSimulator {
    public static void main(String[] args){
        Car.CarBuilder builder = new Car.CarBuilder();
        Car c1 = builder.setColor("Grey")
                .setSeats(6)
                .setNavigationSystem(true)
                .setSunroof(true)
                .build();
        System.out.println(c1);
        Car c2 = new Car.CarBuilder().setColor("Red")
                .setNavigationSystem(true)
                .setSunroof(true)
                .build();
        System.out.println(c2);
    }
}
