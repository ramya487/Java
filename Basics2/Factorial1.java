/*Write a program that takes a number as input from the user and prints all the factors of that number using for loop*/
import java.util.Scanner;

public class Factorial1 {
    public static void main(String args[]){
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = myObj.nextInt();
        int fac = 1;
        for (int i = 1; i<=n; i++){
            fac = fac*i;
        }
        System.out.println("Factorial: "+fac);
    }
}
