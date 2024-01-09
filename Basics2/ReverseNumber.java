/*Write a program that takes a number as input from the user and prints the reverse of that number*/
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String args[]){
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = myObj.nextInt();
        int rev = 0;
        int ldigit;
        while (n>0){
            ldigit = n%10;
            rev = rev*10+ldigit;
            n = n/10;
        }
        System.out.println("Reverse: "+rev);
    }
}
