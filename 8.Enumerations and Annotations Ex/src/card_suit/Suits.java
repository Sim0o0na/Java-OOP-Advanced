package card_suit;

/**
 * Created by Sim0o on 3/27/2017.
 */
public enum Suits {
    CLUBS(0), HEARTS(1), DIAMONDS(2), SPADES(3);

    private int c;

    Suits(int c) {
        this.c = c;
    }

    public int getValue() {
        return c;
    }
}
