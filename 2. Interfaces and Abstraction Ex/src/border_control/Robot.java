package border_control;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Robot implements Habitant {
    private String model;
    private String id;

    public Robot(String model,String id){
        this.model = model;
        this.id = id;
    }

    public String getModel() {
        return this.model;
    }

    public String getId() {
        return this.id;
    }
}
