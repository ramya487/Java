// Remove all the even numbers from an ArrayList
import java.util.Scanner;
import java.util.ArrayList;
public class RemoveEven {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.println("Enter the integers space separated..");
        String input = myObj.nextLine();
        String[] result = input.split(" ");
        int element;
        for (String item: result){
            element = Integer.parseInt(item);
            arrayList.add(element);
        }
        System.out.println("ArrayList before removal: "+arrayList);
        for (int i = 0; i<arrayList.size(); i++){
            if (arrayList.get(i)%2 == 0){
                arrayList.remove(i);
                i--;
            }
        }
        System.out.println("ArrayList after removal: "+arrayList);
        myObj.close();
    }
}
