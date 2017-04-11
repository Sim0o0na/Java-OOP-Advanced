package layouts;

import interfaces.Layout;

/**
 * Created by Sim0o on 4/7/2017.
 */
public class XMLLayout implements Layout {
    @Override
    public String format(String date, String reportLevel, String messageBody) {
        StringBuilder sb = new StringBuilder();
//        <log>
//            <date>3/31/2015 5:33:07 PM</date>
//            <level>ERROR</level>
//            <message>Error parsing request</message>
//        </log>
        sb.append("<log>\n")
                .append(String.format(" <date>%s</date>\n", date))
                .append(String.format(" <level>%s</level>\n", reportLevel))
                .append(String.format(" <message>%s</message>\n", messageBody))
                .append("<log>\n");
        return sb.toString();
    }
}
