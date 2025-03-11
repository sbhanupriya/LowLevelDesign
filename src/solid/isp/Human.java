package solid.isp;

public class Human implements Eatable,Workable{

    @Override
    public void eat() {
        System.out.println("Man is eating");
    }

    @Override
    public void work() {
        System.out.println("Main is working");
    }
}
