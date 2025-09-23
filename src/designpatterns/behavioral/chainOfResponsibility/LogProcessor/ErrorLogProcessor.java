package designpatterns.behavioral.chainOfResponsibility.LogProcessor;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }
    @Override
    public void log(int logLevel, String message) {
        if(logLevel==ERROR)
            System.out.println("ERROR:" + message);
        else
            next.log(logLevel,message);
    }
}
