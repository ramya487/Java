/*Find the index of the first occurrence of a specific element in a List. */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class FirstIndex {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the elements separated by space: ");
        String[] elementArray = myObj.nextLine().split(" ");
        List<String> arrayList = new ArrayList<String>();
        for (int i = 0; i<elementArray.length; i++){
            arrayList.add(elementArray[i]);
        }
        System.out.print("Enter the string to search: ");
        String search = myObj.nextLine();
        System.out.println("Index: "+arrayList.indexOf(search));
    }
}
