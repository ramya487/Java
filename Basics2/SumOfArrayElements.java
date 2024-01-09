// Sum of array elements
import java.util.Scanner;
import java.util.ArrayList;
public class SumOfArrayElements {
    public static void main(String[] args){
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the size: ");
        n = myObj.nextInt();
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        int element;
        int summ = 0;
        for (int i = 0; i<n; i++){
            element = myObj.nextInt();
            intArray.add(element);
            summ+=element;
        }
        System.out.println("Summ: "+summ);
    }
}
