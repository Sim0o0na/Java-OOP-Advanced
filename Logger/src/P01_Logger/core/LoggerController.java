package P01_Logger.core;

import P01_Logger.enums.ReportLevel;
import P01_Logger.interfaces.*;
import P01_Logger.interfaces.io.Reader;
import P01_Logger.models.appenders.FileAppender;
import P01_Logger.models.files.LogFile;

import java.io.IOException;

public class LoggerController implements Controller {

    private Reader reader;
    private Logger logger;
    private LoggerCreator loggerCreator;
    private LayoutCreator layoutCreator;
    private AppenderCreator appenderCreator;

    public LoggerController(Reader reader, LoggerCreator loggerCreator, LayoutCreator layoutCreator, AppenderCreator appenderCreator) {
        this.reader = reader;
        this.loggerCreator = loggerCreator;
        this.layoutCreator = layoutCreator;
        this.appenderCreator = appenderCreator;
    }

    public void processMessage(String input) {
        String[] inputTokens = input.split("\\|");
        String reportToken = inputTokens[0];
        String timeToken = inputTokens[1];
        String messageToken = inputTokens[2];

        ReportLevel reportLevel = ReportLevel.valueOf(reportToken);
        switch (reportLevel) {
            case INFO:
                this.logger.logInfo(timeToken, messageToken);
                break;
            case WARNING:
                this.logger.logWarning(timeToken, messageToken);
                break;
            case ERROR:
                this.logger.logError(timeToken, messageToken);
                break;
            case CRITICAL:
                this.logger.logCritical(timeToken, messageToken);
                break;
            case FATAL:
                this.logger.logFatal(timeToken, messageToken);
                break;
            default:
                throw new IllegalArgumentException("Illegal report level");
        }
    }

    public void initializeLogger() throws IOException {
        String input = reader.read();
        int appenderCount = Integer.valueOf(input);
        Appender[] appenders = new Appender[appenderCount];

        for (int i = 0; i < appenderCount; i++) {
            String[] inputTokens = reader.read().split("\\s+");
            String appenderType = inputTokens[0];
            String layoutType = inputTokens[1];

            Layout layout = this.layoutCreator.create(layoutType);
            Appender appender = this.appenderCreator.create(appenderType, layout);

            if (inputTokens.length > 2) {
                ReportLevel reportLevel = ReportLevel.valueOf(inputTokens[2]);
                appender.setReportLevel(reportLevel);
            }

            if (appenderType.equals("FileAppender")) {
                File file = new LogFile();
                ((FileAppender) appender).setFile(file);
            }

            appenders[i] = appender;
        }

        this.logger = this.loggerCreator.create(appenders);
    }

    public String printLogStatistics() {
        return this.logger.toString();
    }
}
