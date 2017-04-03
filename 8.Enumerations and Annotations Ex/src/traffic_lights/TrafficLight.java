package traffic_lights;

import java.util.Iterator;

/**
 * Created by Sim0o on 3/27/2017.
 */
public class TrafficLight implements Iterable<TrafficLightColors> {
    private int currentIndex;
    private TrafficLightColors currentLight;

    public TrafficLight(TrafficLightColors currentLight){
        this.currentLight = currentLight;
    }

    @Override
    public Iterator<TrafficLightColors> iterator() {
        return new Iterator<TrafficLightColors>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public TrafficLightColors next() {
                switch (currentLight.name()) {
                    case "RED":
                        currentLight = TrafficLightColors.valueOf("GREEN");
                        break;
                    case "GREEN":
                        currentLight = TrafficLightColors.valueOf("YELLOW");
                        break;
                    default:
                        currentLight = TrafficLightColors.valueOf("RED");
                        break;
                }
                return currentLight;
            }
        };
    }
}
