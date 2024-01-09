/*Java Program To Find if a given integer X appears more than N/2 times in an Array */
import java.util.Scanner;
import java.util.Arrays;
public class Frequency {
    public static void main(String[] args) {
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the size: ");
        n = myObj.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements...");
        for (int i = 0; i<n; i++){
            array[i] = myObj.nextInt();
        }
        System.out.println("Array: "+Arrays.toString(array));
        System.out.print("Enter the element to be searched: ");
        int element = myObj.nextInt();
        int count = 0;
        for (int i = 0; i<n; i++){
            if (array[i] == element){
                count++;
            }
        }
        if (count > n/2){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
