package designpatterns.creational.singleton;

public class DoubleCheckedLogger {
    private static DoubleCheckedLogger instance;
    private DoubleCheckedLogger(){
    }
    public static DoubleCheckedLogger getInstance(){
        if(instance==null){
            synchronized (DoubleCheckedLogger.class){
                if(instance==null)
                    instance = new DoubleCheckedLogger();
            }
        }
        return instance;
    }
}
