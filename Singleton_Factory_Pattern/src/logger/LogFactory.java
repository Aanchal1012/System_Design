package logger;
//factory pattern
public class LogFactory {
    public static ILogger getLogger(String type){
        switch (type.toUpperCase()){
            case "CONSOLE":
                return new ConsoleLogger();
            case "FILE":
                return new FileLogger();
            case "REMOTE":
                return new RemoteLogger();
            default:
                throw new IllegalArgumentException("Log type not supported" + type);
        }

    }
}
