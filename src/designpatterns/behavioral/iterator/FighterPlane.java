package designpatterns.behavioral.iterator;

public class FighterPlane implements IAircraft{

    private String name;
    public FighterPlane(String str){
        this.name = str;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("FighterPlane "+  name +" is flying!!");
    }
}
