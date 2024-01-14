/*Java Queues - using the first type of queue methods (throws exception) */

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
public class QueuePgm1 {
    public static void main(String[] args) {
        int queueCapasity;
        queueCapasity = 3;
        Queue<Integer> queue = new ArrayBlockingQueue<Integer>(queueCapasity);

        // using queue.element()
        try{
            queue.element();
        } catch (Exception e){
            System.out.println("No head element yet");
        }
        queue.add(1);
        queue.add(1);
        System.out.println("Size of Queue after 2 elements: "+queue.size());
        queue.add(2);
        System.out.println("Size of Queue after 3 elements: "+queue.size());
        // using queue.add() more than the capasity
        try{
            queue.add(4);
        } catch (Exception e){
            System.out.println("Tried to add too many items..");
        }
        for (Integer element: queue){
            System.out.print(element+" ");
        }
        System.out.println();
        // using queue.remove() more than the capasity
        try{
            for (int i = 0; i<queueCapasity+1; i++){
                System.out.println("Queue remove: "+queue.remove());
            }
        } catch (Exception e){
            System.out.println("Removing more than the capasity");
        }

    }
}
