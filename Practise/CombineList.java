// Combine two Lists into a new List, alternating elements from each List
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class CombineList {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        List<Integer> arrayList3 = new ArrayList<Integer>();
        String[] array1 = myObj.nextLine().split(" ");
        List<String> arrayList1 = new ArrayList<String>(Arrays.asList(array1));
        String[] array2 = myObj.nextLine().split(" ");
        List<String> arrayList2 = new ArrayList<String>(Arrays.asList(array2));
        System.out.println("ArrayList1: "+arrayList1);
        System.out.println("ArrayList2: "+arrayList2);
        for (int i = 0; i<arrayList1.size(); i++){
            arrayList3.add(Integer.parseInt(arrayList1.get(i)));
            arrayList3.add(Integer.parseInt(arrayList2.get(i)));
        }
        System.out.println("ArrayList3: "+arrayList3);
        myObj.close();
    }
}
