package tuple;

/**
 * Created by Sim0o on 3/17/2017.
 */
import java.util.List;
import java.util.Map;

public class Tuple<TFirst, TSecond, TThird> implements Map.Entry<TFirst, TSecond, TThird>
{
    private TFirst item1;
    private TSecond item2;
    private TThird item3;

    public Tuple(TFirst item1, TSecond item2, TThird item3)
    {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public TFirst getKey()
    {
        return this.item1;
    }

    public TSecond getValue()
    {
        return this.item2;
    }

    public TFirst setKey(TFirst key)
    {
        return this.item1 = key;
    }

    public TSecond setValue(TSecond value)
    {
        return this.item2 = value;
    }

    @Override
    public String toString(){
        return String.format("%s -> %s", this.getKey(), this.getValue());
    }
}