package say_hello_extended;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class BasePerson implements Person {
    private String name;
    
    public BasePerson(String name){
        this.setName(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }

    @Override
    public String getName(){
        return this.name;
    }
    private void setName(String name) {
        this.name = name;
    }
}
