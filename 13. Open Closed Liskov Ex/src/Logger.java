import interfaces.Appender;
import loggers.Writer;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sim0o on 4/7/2017.
 */
public class Logger implements interfaces.Logger {
    private List<Appender> appenders;
    private Writer writer;

    public Logger(Appender... appenders){
        this.appenders = Arrays.asList(appenders);
    }

    @Override
    public void processMessage(String message){
        String[] messageArgs = message.split("\\|");
        String reportLevel = messageArgs[0];
        String date = messageArgs[1];
        String messageBody = messageArgs[2];

        for(Appender appender:this.appenders){
            appender.append(date,reportLevel,messageBody);
        }
    }
}
