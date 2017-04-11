package layouts;

import interfaces.Layout;

/**
 * Created by Sim0o on 4/7/2017.
 */
public class SimpleLayout implements Layout {
    @Override
    public String format(String date, String reportLevel, String messageBody) {
        StringBuilder sb = new StringBuilder();
        //"<date-time> - <report level> - <message>")
        sb.append(String.format("<%s> - <%s> - <%s>", date,reportLevel,messageBody));
        return sb.toString();
    }
}
