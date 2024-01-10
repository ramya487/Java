/*Given a Map, check if it contains a specific key. */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class MapKey {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();
        int x;
        System.out.print("Enter the value of x: ");
        x = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Enter the map elements...");
        String[] element;
        for (int i = 0; i<x; i++){
            element = myObj.nextLine().split(" ");
            map.put(element[0], Integer.valueOf(element[1]));
        }
        String search;
        System.out.println("Enter the key: ");
        search = myObj.nextLine();
        if (map.containsKey(search)){
            System.out.println("The given map contains key: "+search);
        } else{
            System.out.println("The given map does not contain key: "+search);
        }
    }
}
