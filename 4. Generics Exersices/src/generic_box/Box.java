package generic_box;

/**
 * Created by Sim0o on 3/16/2017.
 */
public class Box<T> {
    private T content;
    public Box(T content){
        this.content = content;
    }
    public T getContent(){
        return this.content;
    }

    @Override
    public String toString(){
        return String.format("%s: %s", this.content.getClass().getName(), this.getContent());
    }
}
