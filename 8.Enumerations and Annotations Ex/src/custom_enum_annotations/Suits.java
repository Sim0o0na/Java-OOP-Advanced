package custom_enum_annotations;

/**
 * Created by Sim0o on 3/27/2017.
 */
@CustomAnnotation(type="Enumeration", category = "Suit", description = "Provides suit constants for a Card class.")
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
