package designpatterns.behavioral.chainOfResponsibility.LogProcessor;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }
    @Override
    public void log(int logLevel, String message) {
        if(logLevel==DEBUG)
            System.out.println("DEBUG:" + message);
        else
            next.log(logLevel,message);
    }
}
