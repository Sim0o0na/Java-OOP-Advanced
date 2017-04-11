package P01_Logger.interfaces;

public interface AppenderCreator {
   Appender create(String appenderType, Layout layout);
}
