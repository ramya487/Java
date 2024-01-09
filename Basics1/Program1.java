// Write a program that takes two 
// integers as input and checks if their product is greater than 100. Print the result.

import java.util.Scanner;
public class Program1 {
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        int int1 = myObj.nextInt();
        int int2 = myObj.nextInt();
        if (int1*int2 > 100){
            System.out.println("Product is greater than 100 : "+int1*int2);
        } else {
            System.out.println("Product is lesser than 100 : "+int1*int2);
        }
    }
}