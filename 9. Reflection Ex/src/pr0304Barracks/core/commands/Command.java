package pr0304Barracks.core.commands;


import pr0304Barracks.contracts.Executable;

/**
 * Created by Sim0o on 3/31/2017.
 */
public abstract class Command implements Executable{
    private String[] data;

    public Command(String[] data){
        this.data = data;
    }

    public String[] getData(){
        return this.data;
    }
}
