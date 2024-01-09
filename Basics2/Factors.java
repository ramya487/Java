// Get the factors of the number
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = myObj.nextInt();
        System.out.println("The factors are...");
        for (int i = 1;i<=n;i++){
            if (n%i == 0){
                System.out.println(i);
            }
        }
    }
}
