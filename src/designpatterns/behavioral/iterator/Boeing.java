package designpatterns.behavioral.iterator;

public class Boeing implements IAircraft{

    private String name;
    public Boeing(String str){
        this.name = str;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("Boeing "+  name +" is flying!!");
    }
}
