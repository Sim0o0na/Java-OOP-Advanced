package coffee_machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sim0o on 3/23/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        String[] command = reader.readLine().split(" ");
        while (!command[0].equals("END")){
            switch (command[0].length()){
                case 1:
                    int value = 0;
//                    switch (command[0].toUpperCase()){
//                        case "ONE":
//                            value = Coin.valueOf(command[0]).ordinal();
//                        case "TWO":
//                            value = Coin.valueOf(command[0]).ordinal();
//                        case "TEN":
//                            value = Coin.valueOf(command[0]).ordinal();
//                        case "TWENTY":
//                            value = Coin.valueOf(command[0]).ordinal();
//                        case "FIFTY":
//                            value = Coin.valueOf(command[0]).ordinal();
//                    }
                    coffeeMachine.insertCoin(command[0]);
                case 2:
                    String coffeeType = command[0];
                    String coffeeSize = command[1];

                    coffeeMachine.buyCoffee(coffeeSize,coffeeType);
            }
            command = reader.readLine().split(" ");
        }
    }
}
