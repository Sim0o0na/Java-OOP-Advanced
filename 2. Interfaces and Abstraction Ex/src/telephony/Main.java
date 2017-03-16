package telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split("\\s+");
        String[] urls = reader.readLine().split("\\s+");

        Phone phone = new Smartphone();
        for(String number:numbers){
            char[] numberCharArray = number.toCharArray();
            boolean canCall = true;
            for(Character ch:numberCharArray){
                if(!Character.isDigit(ch)){
                    canCall = false;
                    break;
                }
            }
            if(canCall){
                System.out.println(phone.call(number));
            }else{
                System.out.println("Invalid number!");
            }
        }
        for(String url:urls){
            if(url.matches(".*\\d.*")){
                System.out.println("Invalid URL!");
            }
            else {
                System.out.println(phone.browse(url));
            }
        }
    }
}
