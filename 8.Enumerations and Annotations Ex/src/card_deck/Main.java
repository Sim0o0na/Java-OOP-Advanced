package card_deck;

/**
 * Created by Sim0o on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) {
        for(Suits suit : Suits.values()){
            for(Ranks rank : Ranks.values()){
                System.out.printf("%s of %s\n", rank.name(), suit.name());
            }
        }
    }
}
