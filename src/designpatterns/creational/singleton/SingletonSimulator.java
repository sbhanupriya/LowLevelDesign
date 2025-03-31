package designpatterns.creational.singleton;

public class SingletonSimulator {
    public static void main(String[] args){
        SimpleLogger logger = SimpleLogger.getInstance();
        System.out.println("SIMPLE LOGGER");
        System.out.println(logger);
        System.out.println(SimpleLogger.getInstance());

        System.out.println("THREAD SAFE LOGGER");
        ThreadSafeLogger threadSafeLogger = ThreadSafeLogger.getInstance();
        System.out.println(threadSafeLogger);
        System.out.println(ThreadSafeLogger.getInstance());

        System.out.println("DOUBLE CHECKED LOGGER");
        DoubleCheckedLogger doubleCheckedLogger = DoubleCheckedLogger.getInstance();
        System.out.println(doubleCheckedLogger);
        System.out.println(DoubleCheckedLogger.getInstance());

        System.out.println("BILL PUGH SINGLETON LOGGER");
        LoggerUsingStaticInnerClass loggerUsingStaticInnerClass = LoggerUsingStaticInnerClass.getInstance();
        System.out.println(loggerUsingStaticInnerClass);
        System.out.println(LoggerUsingStaticInnerClass.getInstance());

    }
}
