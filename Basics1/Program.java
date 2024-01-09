// Even or Odd

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        System.out.print("Enter the Number: ");
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        if (num%2 == 0 ){
            System.out.println("Number "+num+" is Even");
        } else {
            System.out.println("Number "+num+" is Odd");
        }
    }
}
