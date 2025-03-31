package designpatterns.creational.singleton;

public class SimpleLogger {
    private static SimpleLogger instance;
    private SimpleLogger(){

    }
    public static SimpleLogger getInstance(){
        if(instance == null){
            instance = new SimpleLogger();
        }
        return instance;
    }
}
