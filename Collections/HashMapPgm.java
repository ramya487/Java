import java.util.Map;
import java.util.HashMap;
public class HashMapPgm {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        String one = map.get(1); //  key not present means returns null
        System.out.println(one);

        // iteration
        System.out.println("Map before removal");
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: "+key+" Value: "+value);
        }

        map.remove(1);

        System.out.println("Map after removal");
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: "+key+" Value: "+value);
        }
    }
}
