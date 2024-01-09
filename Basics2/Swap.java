// Swap numbers
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a,b;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = myObj.nextInt();        
        System.out.print("Enter the value of b: ");
        b = myObj.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }
}
