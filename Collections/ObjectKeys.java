/*Using objects (class instances) as keys in map and as elements in set
 * Note: Any duplicates that the contents of the instance same then also repeated in map, set
 * this has not been shown
 */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class Person{
    public int id;
    public String name;
    Person(String name, int id){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return ("Id: "+this.id+" Name: "+this.name);
    }
}

public class ObjectKeys {
    public static void main(String[] args) {
        int x;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = myObj.nextInt();
        myObj.nextLine();
        String[] element;
        int counter = 0;
        System.out.println("Enter the elements...");
        Map<Person, Integer> map = new HashMap<Person, Integer>();
        Set<Person> set1 = new HashSet<Person>();
        for (int i = 0; i<x; i++){
            element = myObj.nextLine().split(" ");
            map.put(new Person(element[0], Integer.parseInt(element[1])), counter);
            set1.add(new Person(element[0], Integer.parseInt(element[1])));
            counter++;
        }
        System.out.println("Keys of Map...");
        for (Person item: map.keySet()){
            System.out.println(item);
        }
        System.out.println("Set: "+set1);
        for (Person itemsSet: set1){
            System.out.println("Name: "+itemsSet.name);
        }
        myObj.close();
    }
}
