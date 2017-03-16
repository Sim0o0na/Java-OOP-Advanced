import java.util.HashMap;

/**
 * Created by Sim0o on 3/15/2017.
 */
public class Engineer extends SpecialisedSoldier{
    private HashMap<String, Integer> repairs;
    public Engineer(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new HashMap<>();
    }

    public HashMap<String, Integer> getRepairs(){
        return this.repairs;
    }

    public void addRepair(String name, int hours){
        this.getRepairs().put(name, hours);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %s Salary: %.2f\n", this.getFirstName(), this.getLastName(),
                this.getId(), this.getSalary()));
        sb.append(String.format("Corps: %s\n", this.getCorps()));
        sb.append(String.format("Repairs:\n", this.getCorps()));
        for(String repair:this.getRepairs().keySet()){
            sb.append(String.format("  Part Name: %s Hours Worked: %s\n", repair, this.getRepairs().get(repair)));
        }
        return sb.toString();
    }
}
