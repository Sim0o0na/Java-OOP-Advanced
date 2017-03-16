package military_elite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sim0o on 3/15/2017.
 */
public abstract class SpecialisedSoldier extends LeutenantGeneral implements ISpesializedSoldier{
    private String corps;

    public SpecialisedSoldier(String id, String firstName, String lastName, double salary,String corps){
        super(id,firstName,lastName,salary);
        this.setCorps(corps);
    }

    public String getCorps(){
        return this.corps;
    }

    private void setCorps(String corps) {
        this.corps = corps;
    }
}
