import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Sim0o on 3/15/2017.
 */
public class LeutenantGeneral extends Private implements ILeutenantGeneral {
    private List<String> privates;
    public LeutenantGeneral(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public List<String> getPrivates() {
        return this.privates;
    }

    public void addPrivate(String id){
        this.getPrivates().add(id);
    }

    public String toString(TreeMap<String,Private> privates){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %s Salary: %.2f\n", this.getFirstName(), this.getLastName(),
                this.getId(), this.getSalary()));
        sb.append("Privates:\n");
        for(String pr:this.getPrivates()){
            sb.append("  " + privates.get(pr).toString() + "\n");
        }
        return sb.toString();
    }
}
