package designpatterns.creational.singleton;

public class LazyInitializationLogger {
    private static LazyInitializationLogger instance;
    private LazyInitializationLogger(){

    }
    public static LazyInitializationLogger getInstance(){
        if(instance == null){
            instance = new LazyInitializationLogger();
        }
        return instance;
    }
}
