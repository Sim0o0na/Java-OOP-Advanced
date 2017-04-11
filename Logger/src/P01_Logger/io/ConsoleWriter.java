package P01_Logger.io;

import P01_Logger.interfaces.io.Writer;

public class ConsoleWriter implements Writer {

    public void writeLine(String message) {
        System.out.println(message);
    }
}
