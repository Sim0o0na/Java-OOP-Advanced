package P01_Logger.interfaces;

import P01_Logger.enums.ReportLevel;

public interface Appender {
    Layout getLayout();
    void setReportLevel(ReportLevel reportLevel);
    ReportLevel getReportLevel();
    void append(String time, String message, ReportLevel reportLevel);
}
