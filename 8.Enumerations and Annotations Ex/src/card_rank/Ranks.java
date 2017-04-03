package card_rank;

/**
 * Created by Sim0o on 3/27/2017.
 */
public enum Ranks {
    ACE(0), TWO(1), THREE(2), FOUR(3), FIVE(4), SIX(5), SEVEN(6), EIGHT(7), NINE(8), TEN(9), JACK(10), QUEEN(11), KING(12);

    private int c;

    Ranks(int c) {
        this.c = c;
    }

    public int getValue() {
        return c;
    }
}
