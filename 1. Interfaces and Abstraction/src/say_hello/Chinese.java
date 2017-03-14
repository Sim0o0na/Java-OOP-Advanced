package say_hello;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Chinese implements Person
{
    private String name;

    public Chinese(String name){
        this.name=name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }

    @Override
    public String getName() {
        return null;
    }
}
