package designpatterns.behavioral.chainOfResponsibility.LogProcessor;

public class Demo {
    public static  void main(String[] args){
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(0,"log the incoming request");
        logProcessor.log(1, "debug the payload to extract payment data");
        logProcessor.log(2, "error handle null pointer exception");

        logProcessor.log(3, "error handle null pointer exception");
    }
}
