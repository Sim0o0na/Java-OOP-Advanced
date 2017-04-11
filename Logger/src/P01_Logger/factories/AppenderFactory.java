package P01_Logger.factories;

import P01_Logger.interfaces.Appender;
import P01_Logger.interfaces.AppenderCreator;
import P01_Logger.interfaces.Layout;
import P01_Logger.models.appenders.ConsoleAppender;
import P01_Logger.models.appenders.FileAppender;

public class AppenderFactory implements AppenderCreator {

    public Appender create(String appenderType, Layout layout) {
        Appender appender;

        switch (appenderType) {
            case "ConsoleAppender":
                return appender = new ConsoleAppender(layout);
            case "FileAppender":
                return appender = new FileAppender(layout);
            default:
                throw new IllegalArgumentException("Invalid appender type.");
        }
    }
}
