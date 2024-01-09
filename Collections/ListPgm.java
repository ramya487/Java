// Analyse the time taken for ArrayList and LinkedList insertions
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class ListPgm {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
        ListPgm.insertionTime("ArrayList", arrayList);
        ListPgm.insertionTime("LinkedList", linkedList);
    }
    public static void insertionTime(String type, List<Integer> list){
        for (int i = 0; i<1E5; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();

        /*// Add elements towards end
        for (int i = 0; i<1E5; i++){
            list.add(i);
        }*/

        // Add elements towards beginning
        for (int i = 0; i<1E5; i++){
            list.add(0,1);
        }

        long end = System.currentTimeMillis();
        long diff = end - start;
        
        System.out.println("Type: "+type+" Time: "+diff+" ms");
    }
}