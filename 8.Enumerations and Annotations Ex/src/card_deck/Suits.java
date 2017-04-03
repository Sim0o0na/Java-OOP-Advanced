package card_deck;



/**
 * Created by Sim0o on 3/27/2017.
 */

public enum Suits {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int c;

    Suits(int c) {
        this.c = c;
    }

    public int getValue() {
        return c;
    }
}
