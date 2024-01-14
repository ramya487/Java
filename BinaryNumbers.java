/*
Generate Binary Numbers from 1 to N
using stack
*/
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Stack;
public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int N;
        System.out.print("Enter the value of N: ");
        N = myObj.nextInt();
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        Stack<Integer> s; // only declare a stack instance over here do not initialise
        int element;
        String string1;
        for (int i = 1; i<=N; i++){
            element = i;
            string1 = "";
            s = new Stack<Integer>(); // create a new instance of stack for each number in the range
            while (element>0){
                System.out.println(element);
                s.push(element%2);
                element = element/2;
            }
            while (!s.isEmpty()){
                string1+=String.valueOf(s.pop());
            }
            map.put(i,string1);
        }
        System.out.println(map);
        myObj.close();
    }
}
