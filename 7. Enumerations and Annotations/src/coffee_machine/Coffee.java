package coffee_machine;

/**
 * Created by Sim0o on 3/23/2017.
 */
public class Coffee {
    private String size;
    private String type;

    public Coffee(String size, String type){
        this.size = size;
        this.type = type;
    }

    public String getSize(){
        return this.size;
    }

    public String getType(){
        return this.type;
    }
}
