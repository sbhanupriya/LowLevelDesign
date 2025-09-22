package designpatterns.creational.singleton;

public enum SingletonEnum {
    INSTANCE;
    SingletonEnum(){
        System.out.println("Singleton Constructor called");
    }
    public void call(){
        System.out.println("Inside singeton enum class");
    }
}
