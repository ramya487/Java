// Create a program that checks if a given string is a palindrome.
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String str1 = myObj.nextLine();
        for (int i = 0;i<str1.length()/2;i++){
            String subStr1 = str1.substring(i,i+1);
            String subStr2 = str1.substring(str1.length()-i-1, str1.length()-i);
            if (subStr1.equals(subStr2)){
                continue;
            } 
            System.out.println("Not a palindrome");
            return;

        }   
        System.out.println("Palindrome");
    }
}
