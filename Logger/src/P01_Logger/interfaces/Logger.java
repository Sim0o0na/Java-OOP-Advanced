package P01_Logger.interfaces;

public interface Logger {
    Appender[] getAppenders();
    void logInfo(String time, String message);
    void logWarning(String time, String message);
    void logError(String time, String message);
    void logCritical(String time, String message);
    void logFatal(String time, String message);
}
