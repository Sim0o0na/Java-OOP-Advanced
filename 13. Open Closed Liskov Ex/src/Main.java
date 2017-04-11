import appenders.ConsoleAppender;
import interfaces.Appender;
import interfaces.Layout;
import interfaces.Logger;
import layouts.SimpleLayout;
import layouts.XMLLayout;

/**
 * Created by Sim0o on 4/7/2017.
 */
public class Main {
    public static void main(String[] args) {
        Layout simpleLayout = new SimpleLayout();
        Layout xmlLayout = new XMLLayout();
        Appender conApp = new ConsoleAppender(xmlLayout);
        Logger logger = new Logger(conApp);
        logger.processMessage("WARNING|3/26/2015 2:22:13 PM|Warning: ping is too high - disconnect imminent");
    }
}
