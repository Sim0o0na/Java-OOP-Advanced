package card_rank;


/**
 * Created by Sim0o on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for(Ranks rank: Ranks.values()){
            System.out.printf("Ordinal value: %s; Name value: %s%n", rank.getValue(), rank.toString());
        }
    }
}
