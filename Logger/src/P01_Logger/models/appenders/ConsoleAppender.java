package P01_Logger.models.appenders;

import P01_Logger.enums.ReportLevel;
import P01_Logger.interfaces.Layout;
import P01_Logger.interfaces.io.Writer;

public class ConsoleAppender extends AbstractAppender {

    private Writer writer;

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        if (reportLevel.ordinal() >= super.getReportLevel().ordinal()) {
            super.messageCount++;
            String output = super.getLayout().format(time, message, reportLevel);
            System.out.println(output);
        }
    }

    @Override
    public String toString() {
        return "Appender type: " + this.getClass().getSimpleName()
                + super.toString();
    }
}
