/*Sort an arrayList using Collections.sort() */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class SortPgm {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        List<String> arrayList = new ArrayList<String>();
        int n;
        System.out.print("Enter the number of strings: ");
        n = myObj.nextInt();
        myObj.nextLine();
        String element;
        System.out.println("Enter the strings...");
        for (int i = 0; i<n; i++){
            element = myObj.nextLine();
            arrayList.add(element);
        }
        System.out.println("ArrayList before sorting: "+arrayList);
        Collections.sort(arrayList);
        System.out.println("ArrayList after sorting: "+arrayList);
    }
}
