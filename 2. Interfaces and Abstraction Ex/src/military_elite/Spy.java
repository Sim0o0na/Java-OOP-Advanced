package military_elite;

/**
 * Created by Sim0o on 3/15/2017.
 */
public class Spy extends Soldier implements ISpy {
    private String codenumber;
    public Spy(String id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codenumber = codeNumber;
    }

    public String getCodeNumber(){
        return this.codenumber;
    }

    @Override
    public String toString(){
        return String.format("Name: %s %s Id: %s Salary: %.2f\n", this.getFirstName(), this.getLastName(),
                this.getId(), this.getCodeNumber());
    }
}
