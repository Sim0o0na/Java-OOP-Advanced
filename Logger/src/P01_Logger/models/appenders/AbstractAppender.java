package P01_Logger.models.appenders;

import P01_Logger.enums.ReportLevel;
import P01_Logger.interfaces.Appender;
import P01_Logger.interfaces.Layout;

public abstract class AbstractAppender implements Appender {

    private static final ReportLevel DEFAULT_REPORT_LEVEL_THRESHOLD = ReportLevel.INFO;

    private Layout layout;
    private ReportLevel reportLevel;
    int messageCount;

    protected AbstractAppender(Layout layout) {
        this.layout = layout;
        this.reportLevel = DEFAULT_REPORT_LEVEL_THRESHOLD;
    }

    @Override
    public Layout getLayout() {
        return this.layout;
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    @Override
    public ReportLevel getReportLevel() {
        return this.reportLevel;
    }

    @Override
    public abstract void append(String time, String message, ReportLevel reportLevel);

    @Override
    public String toString() {
        return ", Layout type: " + this.layout.getClass().getSimpleName()
                + ", Report level: " + this.reportLevel.name()
                + ", Messages appended: " + this.messageCount;
    }
}
