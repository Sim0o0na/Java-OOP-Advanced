package coffee_machine;

/**
 * Created by Sim0o on 3/23/2017.
 */
public enum Coin {
   ONE(1),TWO(2),FIVE(5),TEN(10),TWENTY(20),FIFTY(50);

   private int c;

   Coin(int c){
       this.c = c;
   }

   public int getValue(){
       return this.c;
   }
}
