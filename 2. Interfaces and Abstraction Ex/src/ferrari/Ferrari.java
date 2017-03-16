package ferrari;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Ferrari implements Car {
    private final static String MODEL = "488-Spider";
    private String driverName;

    public Ferrari(String driverName){
        this.driverName = driverName;
    }

    @Override
    public String brake() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString(){
        return String.format("%s/%s/%s/%s", MODEL,brake(), gas(),this.driverName);
    }
}
