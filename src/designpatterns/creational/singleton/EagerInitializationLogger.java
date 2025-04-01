package designpatterns.creational.singleton;

public class EagerInitializationLogger {
    private EagerInitializationLogger(){
    }
    private static EagerInitializationLogger eagerInitializationLogger = new EagerInitializationLogger();
    public static EagerInitializationLogger getInstance(){
        return eagerInitializationLogger;
    }
}
