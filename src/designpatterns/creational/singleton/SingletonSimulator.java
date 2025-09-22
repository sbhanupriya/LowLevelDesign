package designpatterns.creational.singleton;

public class SingletonSimulator {
    public static void main(String[] args){
        EagerInitializationLogger eagerInitializationLogger = EagerInitializationLogger.getInstance();
        System.out.println("Eager Initialization LOGGER");
        System.out.println(eagerInitializationLogger);
        System.out.println(EagerInitializationLogger.getInstance());

        LazyInitializationLogger logger = LazyInitializationLogger.getInstance();
        System.out.println("Lazy Initialization LOGGER");
        System.out.println(logger);
        System.out.println(LazyInitializationLogger.getInstance());

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

        System.out.println("Using Enum Classes");
        System.out.println(SingletonEnum.INSTANCE);
        SingletonEnum.INSTANCE.call();
    }
}
