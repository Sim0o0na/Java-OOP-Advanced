package cards_with_power;

/**
 * Created by Sim0o on 3/27/2017.
 */
public enum Suits {
    CLUBS(0), HEARTS(26), DIAMONDS(13), SPADES(39);

    private int c;

    Suits(int c) {
        this.c = c;
    }

    public int getValue() {
        return c;
    }
}
