// Java Program To Check Array Bounds while Inputting Elements into an Array
/*Concepts
 * Array
 * Exception handling
 */
import java.util.Scanner;
import java.util.Arrays;
public class CheckBounds {
    public static void main(String[] args) {
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the size: ");
        n = myObj.nextInt();
        // System.out.println(n);
        myObj.nextLine();
        int [] array = new int[n];
        try{
            System.out.print("Enter the string: ");
            String[] elements = myObj.nextLine().split(" ");
            for (int i = 0; i<elements.length; i++){
                array[i] = Integer.parseInt(elements[i]);
            }
            System.out.println("Array: "+Arrays.toString(array));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
    }
}
