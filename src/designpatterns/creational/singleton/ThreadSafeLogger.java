package designpatterns.creational.singleton;

public class ThreadSafeLogger {
    private static ThreadSafeLogger instance;
    private ThreadSafeLogger(){
    }
    public synchronized static ThreadSafeLogger getInstance(){
        if(instance == null)
            instance = new ThreadSafeLogger();
        return instance;
    }
}
