/*Write a method to check if a particular element exists in a Set. */
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class SetElement {
    public static void main(String[] args) {
        int n;
        Scanner myObj = new Scanner(System.in);
        Set<Integer> sett = new HashSet<Integer>();
        System.out.println("Enter the no.of.entries: ");
        n = myObj.nextInt();
        myObj.nextLine();
        String[] elements;
        System.out.print("Enter the elements space separeted: ");
        elements = myObj.nextLine().split(" ");
        for (int i = 0; i<elements.length; i++){
            sett.add(Integer.valueOf(elements[i]));
        }
        System.out.println("Set: "+sett);
        Integer search;
        System.out.print("Enter the search element: ");
        search = Integer.valueOf(myObj.nextInt());
        if (sett.contains(search)){
            System.out.println("The set contains the element: "+search);
        } else {
            System.out.println("The set doesn't contain the element: "+search);
        }
        myObj.close();
    }
}
