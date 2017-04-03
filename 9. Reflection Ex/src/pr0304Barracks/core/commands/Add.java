package pr0304Barracks.core.commands;

import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.Unit;
import pr0304Barracks.contracts.UnitFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Sim0o on 3/31/2017.
 */
public class Add extends Command{
    private UnitFactory factory;
    private Repository repo;

    public Add(String[] data, Repository repo, UnitFactory factory){
        super(data);
        this.repo = repo;
        this.factory = factory;
    }

    @Override
    public String execute() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String unitType = this.getData()[1];
        Unit unitToAdd = this.getFactory().createUnit(unitType);
        this.getRepo().addUnit(unitToAdd);
        return unitType + " added!";
    }

    public UnitFactory getFactory() {
        return this.factory;
    }

    public Repository getRepo() {
        return this.repo;
    }
}
