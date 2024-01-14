/*Interleave Two Queues:
Given two queues, implement a method to interleave their elements. 
For example, if Queue1 has elements [1, 2, 3] and Queue2 has elements 
[4, 5, 6], the interleaved queue should be [1, 4, 2, 5, 3, 6]. 
Note: -- using extra space
*/
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class InterleaveQueues {

    public static Queue<Integer> mergeQueue(Queue<Integer> queue1, Queue<Integer> queue2){
        Queue<Integer> queueResult = new LinkedList<Integer>();
        int Size = queue1.size();
        for (int i = 0; i<Size; i++){
            queueResult.offer(queue1.poll());
            queueResult.offer(queue2.poll());
        }
        return queueResult;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Queue<Integer> queue1 = new LinkedList<Integer>();
        Queue<Integer> queue2 = new LinkedList<Integer>();
        int eleSize;
        System.out.print("Enter the no.of.elements: ");
        eleSize = myObj.nextInt();
        Integer element;
        System.out.println("Enter the elements for queue1...");
        for (int i = 0; i<eleSize; i++){
            element = myObj.nextInt();
            queue1.offer(element);
        }
        System.out.println("Queue1: "+queue1);
        System.out.println("Enter the elements for queue2...");
        for (int i = 0; i<eleSize; i++){
            element = myObj.nextInt();
            queue2.offer(element);
        }
        System.out.println("Queue2: "+queue2);
        Queue<Integer> resultQueue = mergeQueue(queue1, queue2);
        System.out.println("Result queue: "+resultQueue);
        System.out.println("Queue1 after merge: "+queue1);
        System.out.println("Queue2 after merge: "+queue2);
        myObj.close();
    }
}
