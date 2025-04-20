package logger;

public class FileLogger implements ILogger{
    public void log (String level, String message){
        System.out.println("File_" + level + " " + message);
    }

}