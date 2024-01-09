/*Write a program that a number as input from the user and prints whether it is a palindrome or not*/
import java.util.Scanner;
public class PalindromeInteger {
    public static void main(String args[]){
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        n = myObj.nextInt();
        int nDup = n;
        int rev = 0;
        int ldigit;
        while (n>0){
            ldigit = n%10;
            rev = rev*10+ldigit;
            n = n/10;
        }
        if (nDup == rev){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
