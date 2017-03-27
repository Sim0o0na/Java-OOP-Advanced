package coffee_machine;

/**
 * Created by Sim0o on 3/23/2017.
 */
public class CoinEntry {
    private Coin coin;

    public CoinEntry(String stringValue){
        this.coin = Coin.valueOf(stringValue);
    }

    public Coin getCoin(){
        return this.coin;
    }
}
