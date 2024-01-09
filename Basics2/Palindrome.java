/*Write a program that gets a string as input from the user and prints whether it is a palindrome or not*/
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        String name;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the String: ");
        name = myObj.nextLine();
        for (int i = 0; i<=name.length()/2; i++){
            if (name.charAt(i) != name.charAt(name.length()-i-1)){
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
