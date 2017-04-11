package P01_Logger.models.layouts;

import P01_Logger.enums.ReportLevel;
import P01_Logger.interfaces.Layout;

public class XmlLayout implements Layout {

    @Override
    public String format(String time, String message, ReportLevel reportLevel) {

        return "<log>" + System.lineSeparator() +
                "   <date>" + time + "</date>" + System.lineSeparator() +
                "   <level>" + reportLevel + "</level>" + System.lineSeparator() +
                "   <message>" + message + "</message>" + System.lineSeparator() +
                "</log>";
    }
}
