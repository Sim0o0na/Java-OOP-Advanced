package card_game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Sim0o on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Player firstPlayer = new Player(reader.readLine());
        Player secondPlayer = new Player(reader.readLine());

        while(true){
            if(secondPlayer.getCards().size()==5){
                break;
            }
            try {
                String[] cardInfoArray = reader.readLine().split(" of ");
                Ranks rank = Ranks.valueOf(cardInfoArray[0].toUpperCase());
                Suits suit = Suits.valueOf(cardInfoArray[1].toUpperCase());
                Card card = new Card(rank, suit);
                if (firstPlayer.getCards().containsKey(card.getCardPower()) ||
                        secondPlayer.getCards().containsKey(card.getCardPower())) {
                    System.out.println("Card is not in the deck.");
                } else {

                    if (firstPlayer.getCards().size() > 4) {
                        secondPlayer.addCard(card);
                    } else {
                        firstPlayer.addCard(card);
                    }
                }
            }catch (IllegalArgumentException e){
                System.out.println("No such card exists.");
            }
        }

        //get maximum power card index
        int firstPlayerBiggestCard = Collections.max(firstPlayer.getCards().keySet());
        int secondPlayerBiggestCard = Collections.max(secondPlayer.getCards().keySet());

        //get card with maximum power index from player's cards
        if(firstPlayer.getCards().get(firstPlayerBiggestCard).getCardPower()>secondPlayer.getCards().get(secondPlayerBiggestCard).getCardPower()){
            System.out.printf("%s wins with %s of %s.", firstPlayer.getName(), firstPlayer.getCards().get(firstPlayerBiggestCard).getCardRank(),
                    firstPlayer.getCards().get(firstPlayerBiggestCard).getCardSuit());
        }
        else{
            System.out.printf("%s wins with %s of %s.", secondPlayer.getName(), secondPlayer.getCards().get(secondPlayerBiggestCard).getCardRank(),
                    secondPlayer.getCards().get(secondPlayerBiggestCard).getCardSuit());
        }
    }
}
