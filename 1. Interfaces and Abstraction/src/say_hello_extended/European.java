package say_hello_extended;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class European extends BasePerson {
    public European(String name){
        super(name);
    }

    @Override
    public String sayHello(){
        return "Hello";
    }
}
