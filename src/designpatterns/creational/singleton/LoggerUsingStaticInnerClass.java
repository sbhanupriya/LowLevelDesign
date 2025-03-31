package designpatterns.creational.singleton;

//Bill Pugh Singleton Pattern
public class LoggerUsingStaticInnerClass {
    private LoggerUsingStaticInnerClass(){
    }
    private static class LoggingHolder{
        private static final LoggerUsingStaticInnerClass INSTANCE = new LoggerUsingStaticInnerClass();
    }

    public static LoggerUsingStaticInnerClass getInstance(){
        return LoggingHolder.INSTANCE;
    }
}
