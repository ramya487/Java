import java.util.Random; // importing Random library/class
public class DieRoll {
    public static void main(String[] args){
        Random randomGenerator = new Random(); // creating an instance
        int dieRoll = randomGenerator.nextInt(6)+1;
         // using nextInt() method of random class 
         // to generate a random integer between 0 to 1 less than the number specified
        while (dieRoll != 5) {
            System.out.println(dieRoll);
            dieRoll = randomGenerator.nextInt(6)+1;
        }
    }
}
