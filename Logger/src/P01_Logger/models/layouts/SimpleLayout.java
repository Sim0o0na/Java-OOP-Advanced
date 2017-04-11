package P01_Logger.models.layouts;

import P01_Logger.enums.ReportLevel;
import P01_Logger.interfaces.Layout;

public class SimpleLayout implements Layout {

    @Override
    public String format(String time, String message, ReportLevel reportLevel) {

        return time +
                " - " +
                reportLevel +
                " - " +
                message;
    }
}
