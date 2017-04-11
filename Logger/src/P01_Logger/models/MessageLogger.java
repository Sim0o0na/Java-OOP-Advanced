package P01_Logger.models;

import P01_Logger.enums.ReportLevel;
import P01_Logger.interfaces.Appender;
import P01_Logger.interfaces.Logger;

public class MessageLogger implements Logger {

    private Appender[] appenders;

    public MessageLogger(Appender... appenders) {
        this.appenders = appenders;
    }

    public Appender[] getAppenders() {
        return appenders;
    }

    @Override
    public void logInfo(String time, String message) {

        ReportLevel reportLevel = ReportLevel.INFO;
        this.appendMessage(time, message, reportLevel);
    }

    @Override
    public void logWarning(String time, String message) {

        ReportLevel reportLevel = ReportLevel.WARNING;
        this.appendMessage(time, message, reportLevel);
    }

    @Override
    public void logError(String time, String message) {

        ReportLevel reportLevel = ReportLevel.ERROR;
        this.appendMessage(time, message, reportLevel);
    }

    @Override
    public void logCritical(String time, String message) {

        ReportLevel reportLevel = ReportLevel.CRITICAL;
        this.appendMessage(time, message, reportLevel);
    }

    @Override
    public void logFatal(String time, String message) {

        ReportLevel reportLevel = ReportLevel.FATAL;
        this.appendMessage(time, message, reportLevel);
    }

    private void appendMessage(String time, String message, ReportLevel reportLevel) {
        for (Appender appender : appenders) {
            appender.append(time, message, reportLevel);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Logger info").append(System.lineSeparator());
        for (Appender appender : appenders) {
            result.append(appender).append(System.lineSeparator());
        }

        return result.toString();
    }
}
