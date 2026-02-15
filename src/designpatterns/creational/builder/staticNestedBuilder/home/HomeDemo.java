package designpatterns.creational.builder.staticNestedBuilder.home;

public class HomeDemo {
    public static  void main(String[] args){
        Home home = new Home.HomeBuilder().setRoof("Wood").setWindow("Steel").setRoom(10).build();
        System.out.println(home);

        Home home2 = new Home.HomeBuilder().setRoof("Wood").setWindow("Brick").build();
        System.out.println(home2);
    }
}
