/*Java Queues - using the second type of queue methods (no exception, but returns special value) */
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
public class QueuePgm2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<Integer>(3);
        if (queue.peek() == null){
            System.out.println("No head");
        }
        queue.offer(2);
        if (queue.peek() == null){
            System.out.println("No head");
        } else {
            System.out.println("Head is: "+queue.peek());
        }
        queue.offer(3);
        queue.offer(4);
        if (!queue.offer(5)){
            System.out.println("Queue is full");
        }
        System.out.println("Queue elements...");
        for (Integer element: queue){
            System.out.print(element+" ");
        }
        System.out.println();
        queue.poll();
        queue.poll();
        queue.poll();
        if (queue.poll() == null){
            System.out.println("Queue is empty");
        }

    }
}
