/*Given a Map of product names and their prices, find and print the product with the highest price. */
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;
public class ProductHighPrice {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        int n;
        Scanner myObj = new Scanner(System.in);
        n = myObj.nextInt();
        myObj.nextLine();
        String[] array;
        System.out.println("Enter the data (name price)...");
        for (int i = 0; i<n; i++){
            array = myObj.nextLine().split(" ");
            map.put(array[0], Integer.valueOf(array[1]));            
        }
        // displaying the map
        System.out.println("Map items");
        for (Map.Entry<String, Integer> item: map.entrySet()){
            System.out.println(item.getKey()+":"+item.getValue());
        }

        System.out.println("Values: "+map.values());
        System.out.println("Max: "+Collections.max(map.values()));

        // product with max price
        System.out.println("Product with max price");
        for (Map.Entry<String, Integer> item: map.entrySet()){
            if (item.getValue() == Collections.max(map.values())){
                System.out.println(item.getKey()+":"+item.getValue());
            }
        }
        myObj.close();
    }
}