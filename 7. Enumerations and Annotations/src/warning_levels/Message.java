package warning_levels;

/**
 * Created by Sim0o on 3/23/2017.
 */
public class Message {
    private Importance level;
    private String content;

    public Message(Importance level, String content){
        this.level = level;
        this.content = content;
    }

    public Importance getLevel(){
        return this.level;
    }
    @Override
    public String toString(){
        return String.format("%s: %s", this.level, this.content);
    }
}
