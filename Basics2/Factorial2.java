/*Write a program that takes a number as input from the user and prints all the;
 factors of that number using while loop*/
import java.util.Scanner;

public class Factorial2 {
    public static void main(String args[]){
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = myObj.nextInt();
        int fac = 1;
        int i = 1;
        while (i<=n){
            fac = fac*i;
            i++;
        }
        System.out.println("Factorial: "+fac);
    }
}
