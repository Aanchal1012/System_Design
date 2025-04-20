package logger;

public class ConsoleLogger implements ILogger {
    public void log(String level, String message){
        System.out.println("Console_"+level+" "+message);
    }
}