package cards_with_power;

import java.util.Comparator;

/**
 * Created by Sim0o on 3/27/2017.
 */
public class Card implements Comparable<Card>{
    private String rank;
    private String suit;
    private int power;

    public Card(String rank, String suit){
        this.suit = suit;
        this.rank = rank;
        this.calculatePower();
    }

    private void calculatePower(){
        this.power = Ranks.valueOf(rank).getValue() + Suits.valueOf(suit).getValue();
    }

    @Override
    public String toString(){
        return String.format("Card name: %s of %s; Card power: %d", rank, suit, power);
    }

    @Override
    public int compareTo(Card another) {
        return Integer.compare(this.getCardPower(), another.getCardPower());
    }

    public int getCardPower() {
        return this.power;
    }
}
