import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * Created by Sim0o on 3/15/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String command = reader.readLine();
        TreeMap<String,Private> privates = new TreeMap<>();
        while(!command.equals("End")){
            String[] arr = command.split("\\s+");
            switch (arr[0].toLowerCase()) {
                case "private":
                    Private pr = new Private(arr[1], arr[2], arr[3], Double.parseDouble(arr[4]));
                    privates.put(pr.getId(),pr);
                    System.out.print(pr.toString());
                    break;
                case "commando":
                    if (arr[5].equals("Marines") || arr[5].equals("Airforces")) {
                        Commando cm = new Commando(arr[1], arr[2], arr[3], Double.parseDouble(arr[4]), arr[5]);
                        for (int i = 6; i < arr.length-1; i+=2) {
                            cm.addMission(arr[i], arr[i + 1]);
                        }
                        System.out.print(cm.toString());
                    }
                    break;
                case "leutenantgeneral":
                    LeutenantGeneral leutenant = new LeutenantGeneral(arr[1], arr[2], arr[3], Double.parseDouble(arr[4]));
                    for (int i = 5; i < arr.length; i++) {
                        leutenant.addPrivate(arr[i]);
                    }
                    System.out.print(leutenant.toString(privates));
                    break;
                case "engineer":
                    if (arr[5].equals("Marines") || arr[4].equals("Airforces")) {
                        Engineer en = new Engineer(arr[1], arr[2], arr[3], Double.parseDouble(arr[4]), arr[5]);
                        for (int i = 6; i < arr.length - 1; i += 2) {
                            en.addRepair(arr[i], Integer.parseInt(arr[i + 1]));
                        }
                        System.out.print(en.toString());
                    }
                    break;
                case "spy":
                    Spy spy = new Spy(arr[1], arr[2], arr[3],arr[4]);
                    System.out.print(spy.toString());
                    break;

            }
            command=reader.readLine();
        }
    }
}
