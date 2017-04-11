package P01_Logger.factories;

import P01_Logger.interfaces.Appender;
import P01_Logger.interfaces.Logger;
import P01_Logger.interfaces.LoggerCreator;
import P01_Logger.models.MessageLogger;

public class LoggerFactory implements LoggerCreator {

    public Logger create(Appender[] appenders) {
        return new MessageLogger(appenders);
    }
}
