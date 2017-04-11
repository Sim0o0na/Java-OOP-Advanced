package P01_Logger.interfaces;

import P01_Logger.enums.ReportLevel;

public interface Layout {
    String format(String time, String message, ReportLevel reportLevel);
}
