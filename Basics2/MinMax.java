/*Write a program to find the maximum and minimum element in an array of integers*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class MinMax {
    public static void main(String[] args) {
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the size: ");
        n = myObj.nextInt();
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        int element;
        for (int i = 0; i<n; i++){
            element = myObj.nextInt();
            intArray.add(element);
        }
        System.out.println("ArrayList: "+Arrays.toString(intArray.toArray()));
        int minn = intArray.get(0);
        int maxx = intArray.get(0);
        for (int i = 0; i<n; i++){
            if (minn>intArray.get(i)){
                minn = intArray.get(i);
            }
            if (maxx<intArray.get(i)){
                maxx = intArray.get(i);
            }
        }
        System.out.println("Minn: "+minn);
        System.out.println("Maxx: "+maxx);
    }
}
