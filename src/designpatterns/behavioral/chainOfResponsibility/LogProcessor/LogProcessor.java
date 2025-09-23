package designpatterns.behavioral.chainOfResponsibility.LogProcessor;

public abstract class LogProcessor {

    public static int DEBUG = 1;
    public static int INFO = 0;
    public static  int ERROR = 2;

    protected LogProcessor next;
    public LogProcessor(LogProcessor next){
        this.next = next;
    }
    public abstract void log(int logLevel, String message);
}
