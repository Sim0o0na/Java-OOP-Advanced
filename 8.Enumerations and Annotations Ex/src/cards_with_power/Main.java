package cards_with_power;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sim0o on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rank = reader.readLine().toUpperCase();
        String suit = reader.readLine().toUpperCase();

        String rank1 = reader.readLine().toUpperCase();
        String suit1 = reader.readLine().toUpperCase();

        Card card = new Card(rank, suit);
        Card card1 = new Card(rank1, suit1);

        if(card.compareTo(card1)==1 || card.compareTo(card1)==0){
            System.out.printf(card.toString());
        }
        else if(card.compareTo(card1)<0){
            System.out.printf(card1.toString());
        }
    }
}
