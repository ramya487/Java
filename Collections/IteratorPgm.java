/*Iterator in java */
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
public class IteratorPgm{
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(2);
        Iterator<Integer> itr = linkedList.iterator();
        int element;
        while (itr.hasNext()){
            element = itr.next();
            if (element == 1){
                itr.remove(); // removes the current element and points to the previous element
            }
            System.out.println(element);
        }
        
    }
}