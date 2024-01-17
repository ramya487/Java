// Java program to demonstrate the use cases of Collections

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
public class ComplexCollections {
    public static void main(String[] args) {
        String[] vehicles = {"Helicopter", "Car", "Truck"};
        String[][] drivers = {{"Helen", "Bob", "Harry"}, 
        {"Julie", "Json", "Park"},
        {"Hasan", "Peter", "Moby"}};
        Map<String, Set<String>> map = new HashMap<String, Set<String>>();
        Set<String> neww;
        for (int i = 0; i<vehicles.length; i++){
            neww = new HashSet<String>();
            for (String item: drivers[i]){
                neww.add(item);
            }
            map.put(vehicles[i], neww);
        }
        System.out.println("Contents..");
        for (String item: map.keySet()){
            System.out.print(item+": ");
            for (String item2: map.get(item)){
                System.out.print(item2+" ");
            }
            System.out.println();
        }
    }
}
