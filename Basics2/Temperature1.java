// Convert from celsius to fahrenheit
import java.util.Scanner;
public class Temperature1 {
    public static void main(String[] args) {
        double f,c;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the temperature in celsius: ");
        c = myObj.nextDouble();
        f = ((9.0/5)*c)+32; //  Ensure atleast one number is a floating point when division in java to obtain a floating point result
        System.out.println("Fahrenheit: "+f);

    }
}
