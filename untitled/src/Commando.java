import java.util.HashMap;

/**
 * Created by Sim0o on 3/15/2017.
 */
public class Commando extends SpecialisedSoldier {

    private HashMap<String, String> missions;
    public Commando(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new HashMap<>();
    }

    public HashMap<String, String> getMissions(){
        return this.missions;
    }

    public void addMission(String missionCodeName, String missionState){
        if(missionState.toLowerCase().equals("inprogress") || missionState.toLowerCase().equals("finished")) {
            this.getMissions().put(missionCodeName, missionState);
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %s Salary: %.2f\n", this.getFirstName(), this.getLastName(),
                this.getId(), this.getSalary()));
        sb.append(String.format("Corps: %s\n", this.getCorps()));
        sb.append("Missions:\n");
        if(!this.getMissions().isEmpty()) {
            for (String mission : this.getMissions().keySet()) {
                sb.append(String.format("  Code Name: %s State: %s\n", mission, this.getMissions().get(mission)));
            }
        }
        return sb.toString();
    }
}
