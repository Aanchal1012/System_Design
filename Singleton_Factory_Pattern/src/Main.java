import logger.GlobalLogger;

public class Main {
    public static void main(String[] args) {
        GlobalLogger logger = GlobalLogger.getInstance("console");
        logger.log("Info", "Application Started");
        logger.log("Debug", "Debugging Details are...");

        //returns the same instance even if someone calls with another type
        GlobalLogger anothertype = GlobalLogger.getInstance("file");
        anothertype.log("Warning", "This logs to console due to singleton");

    }
}