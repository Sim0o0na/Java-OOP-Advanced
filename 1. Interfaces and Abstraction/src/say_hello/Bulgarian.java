package say_hello;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Bulgarian implements Person {
    private String name;
    public Bulgarian(String name){
        this.name = name;
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
