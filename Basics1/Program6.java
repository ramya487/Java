// Write a program that initializes an array with integers and finds the sum of all elements.
import java.util.ArrayList;
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        int n;
        System.out.println("Enter the number of elements: ");
        Scanner myObj = new Scanner(System.in);
        n = myObj.nextInt();
        System.out.println("Enter the elements");
        int element;
        for (int i = 0;i<n;i++){
            element = myObj.nextInt();
            arr1.add(element);
        }
        System.out.println("The Elements are : ");
        for (int i = 0;i<n;i++){
            System.out.print(arr1.get(i)+" ");
        }
    }
}
