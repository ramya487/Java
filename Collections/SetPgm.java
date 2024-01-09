import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetPgm {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<Integer>();
        Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        Set<Integer> treeSet = new TreeSet<Integer>();

        // checking if empty
        checkEmpty("HashSet", hashSet);
        checkEmpty("LinkedHashSet", linkedHashSet);
        checkEmpty("TreeSet", treeSet);

        // inserting items
        insert("HashSet", hashSet);
        insert("LinkedHashSet", linkedHashSet);
        insert("TreeSet", treeSet);

        // displaying items
        display("HashSet", hashSet);
        display("LinkedHashSet", linkedHashSet);
        display("TreeSet", treeSet);

        // checking the existence of an item
        checkContains("HashSet", "One", hashSet);
        checkContains("LinkedHashSet", "One", linkedHashSet);
        // checkContains("TreeSet", "One", treeSet); // this statement throws an error
        // since treeset is sorted thus compares the elements to check existence
        // comparing a string with integer throws an error

        // checking the existence of an item
        checkContains("HashSet", 1, hashSet);
        checkContains("LinkedHashSet", 1, linkedHashSet);
        checkContains("TreeSet", 1, treeSet);

        // new hashSet
        Set<Integer> hashSet2 = new HashSet<Integer>();
        // inserting elements
        for (int i = 0; i<3; i++){
            hashSet2.add(i);
        }

        // creating a new hashset from existing hashset
        Set<Integer> hashSet3 = new HashSet<Integer>(hashSet);
        Set<Integer> hashSet4 = new HashSet<Integer>(hashSet);

        // intersection - inplace for hashSet3
        hashSet3.retainAll(hashSet2);

        // display
        display("HashSet3", hashSet3);

        // difference - inplace for hashSet4
        hashSet4.removeAll(hashSet2);

        // display
        display("HashSet4", hashSet4);
    }

    public static void checkContains(String type, Object element, Set<Integer> set) {
        if (set.contains(element)) {
            System.out.println(type + " contains " + element);
        } else {
            System.out.println(type + " doesn't contain " + element);
        }
    }

    public static void checkEmpty(String type, Set<Integer> set) {
        if (set.isEmpty()) {
            System.out.println(type + " is empty");
        }
    }

    public static void insert(String type, Set<Integer> set) {
        for (int i = 0; i < 5; i++) {
            set.add(i);
        }
    }

    public static void display(String type, Set<Integer> set) {
        System.out.println("Set elements..." + type);
        for (Integer x : set) {
            System.out.println(x);
        }
    }
}
