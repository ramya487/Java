// Map interface
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class MapPgm {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        MapPgm.addValues("HashMap",hashMap);
        MapPgm.addValues("LindedHashMap",linkedHashMap);
        MapPgm.addValues("TreeMap",treeMap);
    }
    public static void addValues(String type, Map<Integer, String> map){
        map.put(9,"Nine");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(3, "Three");
        map.put(7, "Seven");
        System.out.println(type);
        for (Integer x: map.keySet()){
            System.out.println("Key: "+x+" Value: "+map.get(x));
        }
    }
}
