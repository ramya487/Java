/*Write a program that takes a number as input from the user and prints all the even numbers between 1 and that number*/

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String args[]){
        int n;
        System.out.print("Enter the number: ");
        Scanner myObj = new Scanner(System.in);
        n = myObj.nextInt();
        for (int i = 1; i<=n; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
        
    }
}
