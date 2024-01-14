/*Remove duplicate elements in a queue using extra space*/

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class DuplicateElements {

    public static Queue<Integer> removeDuplicates(Queue<Integer> queue1){
        Queue<Integer> queue2 = new LinkedList<Integer>();
        for (Integer item: queue1){
            if (!queue2.contains(item)){
                queue2.offer(item);
            }
        }
        return queue2;
    }
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<Integer>();
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the size of queue: ");
        n = myObj.nextInt();
        Integer element;
        System.out.println("Enter the elements...");
        for (int i = 0; i<n; i++){
            element = myObj.nextInt();
            queue1.offer(element);
        }
        System.out.println("Queue before removing duplicates: "+queue1);
        queue1 = removeDuplicates(queue1);
        System.out.println("Queue after removing duplicates: "+queue1);
        myObj.close();
    }    
}
