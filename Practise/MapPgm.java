/*Given a Map of product names and their prices, find and print the product with the highest price. */
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MapPgm {
    public static void main(String[] args) {
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the no.of.entries: ");
        n = myObj.nextInt();
        myObj.nextLine();
        Map<String, Double> map = new HashMap<String, Double>();
        System.out.println("Enter the entries..");
        String[] element;
        for (int i = 0; i < n; i++) {
            element = myObj.nextLine().split(" ");
            map.put(element[0], Double.valueOf(element[1]));
        }
        double price = 0; // can assign Doublt to double since conversion happens implicitly on assignment
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() > price) {
                price = entry.getValue();
            }
        }
        List<String> products = new ArrayList<String>();
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() == price) {
                products.add(entry.getKey());
            }
        }
        System.out.println("Products: " + products);
        myObj.close();
    }
}