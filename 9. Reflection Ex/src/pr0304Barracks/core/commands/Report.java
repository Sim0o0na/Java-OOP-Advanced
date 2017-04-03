package pr0304Barracks.core.commands;

import pr0304Barracks.contracts.Repository;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Sim0o on 3/31/2017.
 */
public class Report extends Command {
    private Repository repo;
    public Report(String[] data, Repository repo) {
        super(data);
        this.repo = repo;
    }

    @Override
    public String execute() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return this.repo.getStatistics();
    }
}
