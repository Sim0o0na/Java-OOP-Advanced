package P01_Logger;

import P01_Logger.core.LoggerController;
import P01_Logger.factories.AppenderFactory;
import P01_Logger.factories.LayoutFactory;
import P01_Logger.factories.LoggerFactory;
import P01_Logger.interfaces.AppenderCreator;
import P01_Logger.interfaces.Controller;
import P01_Logger.interfaces.LayoutCreator;
import P01_Logger.interfaces.LoggerCreator;
import P01_Logger.interfaces.io.Reader;
import P01_Logger.interfaces.io.Writer;
import P01_Logger.io.ConsoleWriter;
import P01_Logger.io.InputReader;

import java.io.IOException;

public class Main {

    public static void main(String[] args)
    {
        Reader reader = new InputReader();
        Writer writer = new ConsoleWriter();
        LoggerCreator loggerCreator = new LoggerFactory();
        LayoutCreator layoutCreator = new LayoutFactory();
        AppenderCreator appenderCreator = new AppenderFactory();
        Controller controller = new LoggerController(reader, loggerCreator, layoutCreator, appenderCreator);

        try {
            controller.initializeLogger();

            String input = reader.read();
            while (!input.equals("END")) {
                controller.processMessage(input);
                input = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        writer.writeLine(controller.printLogStatistics());
    }
}
