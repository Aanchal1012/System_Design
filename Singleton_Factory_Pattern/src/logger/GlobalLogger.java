package logger;

public class GlobalLogger {
    private static volatile GlobalLogger instance;
    private ILogger logger;
    private GlobalLogger(String type){
        this.logger = LogFactory.getLogger(type);
    }
    public static GlobalLogger getInstance(String type){
        if (instance==null){
            synchronized (GlobalLogger.class){
                if(instance == null){
                    instance = new GlobalLogger(type);
                }
            }
        }
        return instance;
    }
    public void log(String level, String message){
        logger.log(level, message);
    }
}
