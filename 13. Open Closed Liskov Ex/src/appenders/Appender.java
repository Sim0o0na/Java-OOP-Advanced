package appenders;

import interfaces.Layout;

import java.io.Writer;

/**
 * Created by Sim0o on 4/7/2017.
 */
public abstract class Appender implements interfaces.Appender {
    protected Layout layout;

    protected Appender(Layout layout){
        this.layout = layout;
    }
    @Override
    public abstract void append(String date, String reportLevel, String messageBody);
}
