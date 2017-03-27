package warning_levels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Sim0o on 3/23/2017.
 */
public class Logger {
    private Importance treshold;
    private List<Message> messages;

    public Logger(Importance treshold) {
        this.treshold = treshold;
        this.messages = new ArrayList<>();
    }

    public void recordMessage(Message message){
        if(message.getLevel().compareTo(treshold) >= 0){
            this.messages.add(message);
        }
    }

    public List<Message> getMessages(){
        return Collections.unmodifiableList(this.messages);
    }
}
