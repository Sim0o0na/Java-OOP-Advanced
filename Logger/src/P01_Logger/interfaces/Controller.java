package P01_Logger.interfaces;

import java.io.IOException;

public interface Controller {
    void processMessage(String input);
    String printLogStatistics();
    void initializeLogger() throws IOException;
}
