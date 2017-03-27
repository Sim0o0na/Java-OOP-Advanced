package coffee_machine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sim0o on 3/23/2017.
 */
public class CoffeeMachine {
    private int coins;
    private List<Coffee> coffeesSold;

    public CoffeeMachine(){
        this.coffeesSold = new ArrayList<>();
    }

    public void buyCoffee(String coffeeSize, String coffeeType){
        if(this.coins>=CoffeeSize.valueOf(coffeeSize).ordinal()){
            this.coffeesSold.add(new Coffee(coffeeSize,coffeeType));
            this.coins = 0;
        }
    }

    public void insertCoin(String coinEntry){
        this.coins+=Coin.valueOf(coinEntry).getValue();
    }
    public Iterable<Coffee> coffeesSold(){
        return this.coffeesSold;
    }
}
