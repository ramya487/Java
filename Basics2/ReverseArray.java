import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String args[]){
        int n;
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the size: ");
        n = myObj.nextInt();
        int element;
        System.out.println("Enter the elements...");
        for (int i = 0; i<n; i++){
            element = myObj.nextInt();
            intArray.add(element);
        }
        System.out.println("Array before reverse: "+Arrays.toString(intArray.toArray()));
        // toArray() method of array list returns an array containing the elements of the java array list in the same order
        // toString accepts not array list but java builtin array type

        // Reversing the array in place
        int temp;
        for (int i = 0; i<n/2;i++){
            temp = intArray.get(i);
            intArray.set(i, intArray.get(intArray.size()-i-1));
            intArray.set(intArray.size()-i-1, temp);
        }
        System.out.println("Array after reverse: "+Arrays.toString(intArray.toArray()));

    }
}
