/*Convert a List of strings to a Set. */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class ListToSet {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        List<String> arrayList = new ArrayList<String>();
        int x;
        System.out.print("Enter the value of x: ");
        x = myObj.nextInt();
        myObj.nextLine();
        String element;
        for (int i = 0; i<x; i++){
            element = myObj.nextLine();
            arrayList.add(element);
        }
        Set<String> set1 = new HashSet(arrayList);
        System.out.println("List elements..");
        for (String item: arrayList){
            System.out.println(item);
        }
        System.out.println("Set elements...");
        for (String item: set1){
            System.out.println(item);
        }
        myObj.close();
    }
}
