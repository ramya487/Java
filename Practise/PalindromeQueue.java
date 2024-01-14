/*Check if Queue is Palindrome:
Write a program to check if a given queue is a palindrome (reads the same forwards as backward).
*/
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeQueue {

    public static boolean checkPalindrome(Queue<Integer> dupQueue, Queue<Integer> original){
        Stack<Integer> s = new Stack<Integer>();
        while (!dupQueue.isEmpty()){
            s.push(dupQueue.poll());
        }
        while (!s.isEmpty()){
            dupQueue.offer(s.pop());
        }
        if (original.equals(dupQueue)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<Integer>();
        int x;
        System.out.print("Enter the no.of.elements: ");
        x = myObj.nextInt();
        System.out.println("Enter the queue elemnets...");
        Integer element;
        for (int i = 0; i<x; i++){
            element = myObj.nextInt();
            queue.offer(element);
        }
        Queue<Integer> dupQueue = new LinkedList<Integer>(queue);
        if (checkPalindrome(dupQueue, queue)){
            System.out.println("Yes, Palindrome");       
        } else{
            System.out.println("No, not a Palindrome");
        }
    }
    // public static void main(String[] args) {
    //     Queue<Integer> queue1 = new LinkedList<Integer>();
    //     Queue<String> queue2 = new LinkedList<String>();
    //     queue1.offer(1);
    //     queue1.offer(2);
    //     queue1.offer(3);
    //     queue2.offer("1");
    //     queue2.offer("2");
    //     queue2.offer("3");
    //     if (queue1.equals(queue2)){ // not a palindrome since type mismatch occurs
    //         System.out.println("Yes, Palindrome");
    //     }else{
    //         System.out.println("No, Not a Palindrome");
    //     }
    // }
}
