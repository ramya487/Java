// Write a program that takes a word as input and prints it in reverse.

import java.util.Scanner;
public class Program4 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String str1 = myObj.nextLine();
        String reverse = "";
        for (int i = str1.length()-1;i>=0;i--){
            reverse+=str1.substring(i, i+1);
        }
        System.out.println(reverse);
    }
}
