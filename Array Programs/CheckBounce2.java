/*Java Program To Check Array Bounds while Inputting Elements into an Array - 2 */
import java.util.Arrays;
import java.util.Scanner;
public class CheckBounce2 {
    public static void main(String[] args) {
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the size: ");
        n = myObj.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements: ");
        try{
        int i = 0;
        while (true){
            if (i>=n){
                throw new ArrayIndexOutOfBoundsException();
            }
            array[i] = myObj.nextInt();
            i++;
        }
    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index out of bounds");
        System.out.println(Arrays.toString(array));
    }
    }
}
