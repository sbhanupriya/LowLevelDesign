package designpatterns.behavioral.chainOfResponsibility.LogProcessor;

public class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }
    @Override
    public void log(int logLevel, String message) {
        if(logLevel==INFO)
            System.out.println("INFO:" + message);
        else
            next.log(logLevel,message);
    }
}
