/*Write a program that takes a number as input from the user and prints the sum of all digits in that number*/
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String args[]){
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = myObj.nextInt();
        int summ = 0;
        int ldigit;
        while (n>0){
            ldigit = n%10;
            n = n/10;
            summ+=ldigit;
        }
        System.out.println(summ);
    }
}
