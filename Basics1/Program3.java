/*Create a program that calculates the sum of 
all even numbers between 1 and 50 using a loop. */

public class Program3 {
    public static void main(String args[]){
        int summ = 0;
        for (int i = 1;i<=50;i++){
            summ+=i;
        }
        System.out.println("Total: "+summ);
    }
}
