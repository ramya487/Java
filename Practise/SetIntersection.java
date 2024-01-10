/*Write a program to calculate the intersection of two Sets. */
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class SetIntersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        int x,y;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = myObj.nextInt();
        System.out.println("Enter the value of y: ");
        y = myObj.nextInt();
        System.out.println("Enter the elements for set1...");
        int element;
        for (int i = 0; i<x; i++){
            element = myObj.nextInt();
            set1.add(element);
        }
        System.out.println("Enter the elements for set2...");
        for (int i = 0; i<y; i++){
            element = myObj.nextInt();
            set2.add(element);
        }
        Set<Integer> intersection = new HashSet<Integer>(set1);
        intersection.retainAll(set2);
        System.out.println("Set1: "+set1);
        System.out.println("Set2: "+set2);
        System.out.println("Intersection: "+intersection);
    }
}
