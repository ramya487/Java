import java.util.ArrayList; // import ArrayList class to create dynamic lists

public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();

        // To create an empty ArrayList (object) same procedure as creating an instance of the class
        // Except that need to mention the type of elements going to be stored in the ArrayList
        // as generic types

        cars.add("Volkswagen"); 

        // add() method of ArrayList class to add elements
        // adds elements to the end of the ArrayList

        cars.add("Mercedes");
        cars.add("Ford");
        cars.add(1, "Fiet");
        cars.add(4, "tataNew");
        cars.add(5, "tataNew");

        // if index is specified as the first parameter, and element to add second, 
        // element added at the specified index

        // do not try to insert an element at an index that does not exist

        cars.set(2, "Using set() method on ArrayList object");
        // set() method to change the particular element of the ArrayList

        System.out.println(cars.get(2));
        // get() method to get the value at a particular index

        System.out.println(cars.size());
        // size() method to get the size of an ArrayList ie., total no.of.elements

        cars.remove(1);
        // remove() method with index to remove the element at the specified index

        cars.remove("Ford");
        // remove() method with element to remove, removes the 1st occurrence of the
        // specified element

        System.out.println(cars.indexOf("Ford"));
        // indexOf() method to get the index of a particular element

        // ArrayList without specifying the type
        ArrayList noType = new ArrayList<>();
        noType.add("String");
        noType.add(87.67);
        noType.add(12);

        // Here the elements are treated as Objects. Some of the methods could be applied 
        // only after type casting
        // This type of ArrayList declaration and usage is not recommended
    }
}
