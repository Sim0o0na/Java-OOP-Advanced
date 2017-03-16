/**
 * Created by Sim0ona on 3/15/2017.
 */
public abstract class Soldier implements ISoldier {
    private String id;
    private String firstName;
    private String lastName;

    public Soldier(String id, String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setId(id);
    }

    private void setId(String id) {
        this.id=id;
    }

    @Override
    public String getId() {
        return this.id;
    }


    private void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    private void setLastName(String lastName) {
        this.lastName=lastName;
    }

    @Override
    public String getLastName() {
        return this.lastName=lastName;
    }
}
