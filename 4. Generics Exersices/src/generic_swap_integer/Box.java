package generic_swap_integer;

/**
 * Created by Sim0o on 3/16/2017.
 */
public class Box<Integer> {
    private Integer content;
    public Box(Integer content){
        this.content = content;
    }
    public Integer getContent(){
        return this.content;
    }

    @Override
    public String toString(){
        return String.format("%s: %s", this.content.getClass().getName(), this.getContent());
    }
}
