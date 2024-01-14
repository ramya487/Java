/*Reverse Queue - using stack*/
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Stack;
public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> s = new Stack<Integer>();
        while (!queue.isEmpty()){
            s.push(queue.poll());
        }
        while (!s.isEmpty()){
            queue.offer(s.pop());
        }
    }
    public static void main(String[] args) {
        int queueSize;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the size of queue: ");
        queueSize = myObj.nextInt();
        Queue<Integer> queue = new ArrayBlockingQueue<Integer>(queueSize);
        Integer element;
        System.out.println("Enter the elements...");
        for (int i = 0; i<queueSize; i++){
            element = myObj.nextInt();
            queue.offer(element);
        }
        System.out.println("Queue before reverse: "+queue);
        reverseQueue(queue);
        System.out.println("Queue after reverse: "+queue);
    }
}
