package pr0304Barracks.core.commands;

import pr0304Barracks.contracts.Repository;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Sim0o on 3/31/2017.
 *
 */
public class Retire extends Command {
    private String unitToRetire;
    private Repository repo;
    public Retire(String[] data, Repository repo) {
        super(data);
        this.repo = repo;
        this.unitToRetire = data[1];
    }

    @Override
    public String execute() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        this.repo.removeUnit(this.unitToRetire);
        return unitToRetire + " retired!";
    }
}
