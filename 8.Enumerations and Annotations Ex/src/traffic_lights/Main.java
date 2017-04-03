package traffic_lights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sim0o on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        int number = Integer.parseInt(reader.readLine());
        List<TrafficLight> trafficLightList  =  new ArrayList<>();
        for(String element:input){
            TrafficLightColors currentLight = TrafficLightColors.valueOf(element.toUpperCase());
            TrafficLight trafficLight = new TrafficLight(currentLight);
            trafficLightList.add(trafficLight);
        }

        for (int i = 0; i < number; i++) {
            StringBuilder result = new StringBuilder();
            for (TrafficLight aTrafficLightList : trafficLightList) {
                result.append(aTrafficLightList.iterator().next()).append(" ");
            }
            System.out.println(result.toString().trim());
        }
    }
}
