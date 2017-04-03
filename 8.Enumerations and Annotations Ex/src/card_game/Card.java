package card_game;


/**
 * Created by Sim0o on 3/27/2017.
 */
public class Card implements Comparable<Card>{
    private Ranks rank;
    private Suits suit;
    private int power;

    public Card(Ranks rank, Suits suit){
        this.suit = suit;
        this.rank = rank;
        this.calculatePower();
    }

    private void calculatePower(){
        this.power = Ranks.valueOf(rank.name()).getValue() + Suits.valueOf(suit.name()).getValue();
    }

    @Override
    public int compareTo(Card another) {
        return Integer.compare(this.getCardPower(), another.getCardPower());
    }

    public int getCardPower() {
        return this.power;
    }

    public String getCardRank() {
        return this.rank.name();
    }

    public String getCardSuit() {
        return this.suit.name();
    }
}
