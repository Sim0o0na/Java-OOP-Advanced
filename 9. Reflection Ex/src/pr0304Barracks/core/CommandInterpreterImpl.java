package pr0304Barracks.core;

import pr0304Barracks.contracts.Executable;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Sim0o on 3/31/2017.
 */
public class CommandInterpreterImpl implements pr0304Barracks.contracts.CommandInterpreter {
    private static final String COMMANDS_PACKAGE = "pr0304Barracks.core.commands.";

    private UnitFactory factory;
    private Repository repo;

    public CommandInterpreterImpl(UnitFactory factory, Repository repo){
        this.repo = repo;
        this.factory = factory;
    }
    @Override
    @SuppressWarnings("unchecked")
    public Executable interpretCommand(String[] data, String commandName) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //parse command name from input
        Character firstLetter = Character.toUpperCase(commandName.charAt(0));
        String className = COMMANDS_PACKAGE + firstLetter + commandName.substring(1);

        //create command class
        Class<Executable> cmd = (Class<Executable>)Class.forName(className);
        Constructor constructor = cmd.getDeclaredConstructors()[0];

        //get command class constructor parameters
        Object[] constructorArguments = new Object[constructor.getParameterCount()];
        int counter = 0;
        for(Class<?> param: constructor.getParameterTypes()){
            String paramSimpleName = param.getSimpleName();
            switch (param.getSimpleName()){
                case "String[]":
                    constructorArguments[counter] = data;
                    break;
                case "UnitFactory":
                    constructorArguments[counter] = this.factory;
                    break;
                case "Repository":
                    constructorArguments[counter] = this.repo;
            }
            counter++;
        }
        constructor.setAccessible(true);
        return (Executable)constructor.newInstance(constructorArguments);
    }
}
