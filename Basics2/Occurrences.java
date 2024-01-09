/*Write a program to find the number of occurrences of a particular element in an array*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Occurrences {
    public static void main(String[] args) {
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the size: ");
        n = myObj.nextInt();
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        int element;
        for (int i = 0; i<n; i++){
            element = myObj.nextInt();
            intArray.add(element);
        }
        System.out.print("Enter the search element: ");
        int search = myObj.nextInt();
        int count = 0;
        for (int i = 0; i<n; i++){
            if (intArray.get(i) == search){
                count++;
            }
        }
        System.out.println("Count: "+count);
    }
}
