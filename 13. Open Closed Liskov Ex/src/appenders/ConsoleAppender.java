package appenders;

import interfaces.Layout;

import java.io.Writer;

/**
 * Created by Sim0o on 4/7/2017.
 */
public class ConsoleAppender extends Appender {
    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String date, String reportLevel, String messageBody) {
        String formattedMessage = this.layout.format(date,reportLevel,messageBody);
        System.out.println(formattedMessage);
    }
}
