/*Merge two Maps, summing the values for common keys. */
// putAll() copies the key:value pairs of second map to the first making updations as necessary
// first map changed
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class MergeMap {
    public static void main(String[] args) {
        int x,y;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = myObj.nextInt();
        System.out.println("Enter y: ");
        y = myObj.nextInt();
        myObj.nextLine();
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        String[] element;
        System.out.println("Enter the entries for map1...");
        for (int i = 0; i<x; i++){
            element = myObj.nextLine().split(" ");
            map1.put(element[0], Integer.valueOf(element[1]));
        }
        System.out.println("Enter the entries for map2...");
        for (int i = 0; i<y; i++){
            element = myObj.nextLine().split(" ");
            map2.put(element[0], Integer.valueOf(element[1]));
        }
        Map<String, Integer> newMap = new HashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry: map1.entrySet()){
            if (newMap.containsKey(entry.getKey())){
                newMap.put(entry.getKey(), entry.getValue()+map1.get(entry.getKey()));
            } else {
                newMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, Integer> entry: map2.entrySet()){
            if (newMap.containsKey(entry.getKey())){
                newMap.put(entry.getKey(), entry.getValue()+map1.get(entry.getKey()));
            } else {
                newMap.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println("New Map: "+newMap);
    }
}
