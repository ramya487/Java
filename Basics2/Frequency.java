// Write a program to find the frequency of each element in an array
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Frequency {
    public static void main(String[] args) {
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the size: ");
        n = myObj.nextInt();
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        int element;
        System.out.println("Enter the array elements...");
        ArrayList<Integer> dup = new ArrayList<Integer>();
        for (int i = 0;i<n;i++){
            element = myObj.nextInt();
            intArray.add(element);
            if (!dup.contains(element)){
                dup.add(element);
            }
        }
        System.out.println("ArrayList intArray: "+Arrays.toString(intArray.toArray()));
        System.out.println("ArrayList dup: "+Arrays.toString(dup.toArray()));
        int ele1,count;
        for (int i = 0;i<dup.size();i++){
            ele1 = dup.get(i);
            count = 0;
            for (int j = 0; j<n; j++){
                if (intArray.get(j) == ele1){
                    count++;
                }
            }
            System.out.println("Element: "+ele1+" Count: "+count);
        }
    }
}
