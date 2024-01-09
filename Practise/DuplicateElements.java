/*Remove all duplicate elements from a List. */
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<Integer>();
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the no.of.elements: ");
        n = myObj.nextInt();
        int element;
        System.out.println("Enter the entries..");
        for (int i = 0; i<n; i++){
            element = myObj.nextInt();
            arraylist.add(element);
        }
        System.out.println("ArrayList before: "+arraylist);
        Set<Integer> linkedHashSet = new LinkedHashSet<Integer>(arraylist);
        System.out.println("LinkedHashSet: "+linkedHashSet);
        List<Integer> newList = new ArrayList<Integer>(linkedHashSet);
        System.out.println("ArrayList after: "+newList);
        myObj.close();
    }
}
