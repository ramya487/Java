//Write a cpp program that asks the user for their name and greets them
import java.util.Scanner;
public class Greet {
    public static void main(String args[]){
        String name;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = myObj.nextLine();
        System.out.println("Hello "+name+"!!");

    }
}
