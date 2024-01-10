/*Given a Map, sort it based on the values in ascending order. */
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;
public class MapSort {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        int x;
        System.out.print("Enter the number of elements: ");
        x = myObj.nextInt();
        myObj.nextLine();
        String[] element;
        System.out.println("Enter the name and marks separated by space..");
        Set<Integer> set1 = new TreeSet<Integer>(map.values());
        for (int i = 0; i<x; i++){
            element = myObj.nextLine().split(" ");
            map.put(element[0], Integer.valueOf(element[1]));
            set1.add(Integer.valueOf(element[1]));
        }
        System.out.println("Map: "+map);
        Map<String, Integer> mapSorted = new LinkedHashMap<String, Integer>();
        // Storing the sorted order map in a new map
        for (Integer ele: set1){
            for (Map.Entry<String, Integer> item: map.entrySet()){
                if (item.getValue() == ele){
                    mapSorted.put(item.getKey(), item.getValue());
                }
            }
        }
        System.out.println("Map Sorted: "+mapSorted);
        myObj.close();
    }
}
