/*Write a program to find the second largest element in an array*/
import java.util.Scanner;
import java.util.ArrayList;
public class SecondLargestElement {
    public static void main(String args[]){
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
        int maxx = intArray.get(0);
        int minn = intArray.get(0);
        for (int i = 0;i<n;i++){
            if (intArray.get(i)>maxx){
                maxx = intArray.get(i);
            }
            if (intArray.get(i)<minn){
                minn = intArray.get(i);
            }
        }
        int maxxSecond = minn;
        for (int i = 0; i<n;i++){
            if (intArray.get(i)>maxxSecond && intArray.get(i) != maxx){
                maxxSecond = intArray.get(i);
            }
        }
        System.out.println("Second largest: "+maxxSecond);
    }
}
