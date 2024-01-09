// Write a method to remove all occurrences of a specific element from a List.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class RemoveElements {
    public static void main(String[] args) {
        Integer element;
        List<Integer> arrayList = new ArrayList<Integer>();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the elements...");
        char choice = 'y';
        while (choice == 'y'){
            element = myObj.nextInt();
            myObj.nextLine();
            arrayList.add(element);
            System.out.print("Choice: ");
            choice = myObj.nextLine().charAt(0);
        }
        System.out.println("ArrayList before removal: "+arrayList);
        System.out.print("Enter the search element: ");
        Integer search = myObj.nextInt();
        for (int i = 0; i<arrayList.size(); i++){
            if (arrayList.get(i) == search){
                arrayList.remove(i);
                i--;
            }
        }
        System.out.println("ArrayList after removal: "+arrayList);
        myObj.close();
    }
}
