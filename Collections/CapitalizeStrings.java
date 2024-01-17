//Program to capitalize the first character of each string in a ArrayList

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CapitalizeStrings {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        System.out.println("Enter the strings...");
        Scanner myObj = new Scanner(System.in);
        String element = myObj.nextLine();
        while (element.length() != 0){
            arrayList.add(element);
            element = myObj.nextLine();
        }
        System.out.println("ArrayList before change: "+arrayList);
        for (int i = 0; i<arrayList.size(); i++){
            int len = arrayList.get(i).length();
            System.out.println("Length: "+len);
            arrayList.set(i, arrayList.get(i).substring(0,1).toUpperCase()+arrayList.get(i).substring(1, arrayList.get(i).length()));
        }
        System.out.println("ArrayList after change: "+arrayList);

    }
}
