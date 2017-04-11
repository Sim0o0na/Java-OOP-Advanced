package P02_FileStream;

/**
 * Created by Sim0o on 4/4/2017.
 */
public abstract class BaseStream implements Streamable {
    private int length;
    private int bytesSent;

    protected BaseStream(int length, int bytesSent){
        this.bytesSent = bytesSent;
        this.length = length;
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public int getBytesSent() {
        return this.bytesSent;
    }
}
