/*Write a program to print the multiplication 
table (up to 10) for a given number entered by the user */
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        for (int i = 1;i<=10;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
