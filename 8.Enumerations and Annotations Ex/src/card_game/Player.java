package card_game;

import java.util.*;

/**
 * Created by Sim0o on 3/27/2017.
 */
public class Player {
    private Map<Integer, Card> cards;
    private String name;

    public Player(String name){
        this.name = name;
        this.cards = new TreeMap<>();
    }

    public Map<Integer, Card> getCards(){
        return Collections.unmodifiableMap(cards);
    }

    public String getName(){
        return this.name;
    }

    public void addCard(Card card){
        this.cards.put(card.getCardPower(), card);
    }
}
