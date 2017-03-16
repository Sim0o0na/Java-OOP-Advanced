package military_elite;

/**
 * Created by Sim0o on 3/15/2017.
 */
public class Private extends Soldier implements ISoldier
{
    private double salary;
    public Private(String id, String firstName, String lastName, double salary) {
        super(id,firstName,lastName);
        this.setSalary(salary);
    }

    public double getSalary() {
        return this.salary;
    }

    private void setSalary(double salary) {
        this.salary=salary;
    }

    @Override
    public String toString(){
        return String.format("Name: %s %s Id: %s Salary: %.2f\n", this.getFirstName(), this.getLastName(),
                this.getId(), this.getSalary());
    }
}
