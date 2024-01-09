/*Write a program that takes a number as input from the user and prints all the prime numbers between 1 and that number using for loops*/
import java.util.Scanner;
public class Prime {
    public static void main(String args[]){
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = myObj.nextInt();
        if (n<=0){
            System.out.println("Enter a number greater than 0");
            return;
        }
        if (n == 1){
            System.out.println("1 is neither prime nor composite");
            return;
        }
        int flag;
        for (int i = 2; i<=n; i++){
            flag = 1;
            if (i == 2){
                System.out.println(i);
            } else {
                for (int j = 2; j<i; j++){
                    if (i%j == 0){
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1){
                    System.out.println(i);
                }
            }
        }
    }
}
