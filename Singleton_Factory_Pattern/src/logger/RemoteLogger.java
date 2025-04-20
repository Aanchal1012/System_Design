package logger;

public class RemoteLogger implements ILogger{
    public void log (String level, String message){
        System.out.println("Remote_" + level + " " + message);
    }
}
