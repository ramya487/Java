/*Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/
import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Arrays;
public class LongestCommonPrefix {

    public String prefix(){
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the no.of.strings: ");
        n = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Enter the strings...");
        String s;
        ArrayList<String> strArray = new ArrayList<String>();
        for (int i = 0; i<n; i++){
            System.out.println("String: "+i);
            s = myObj.nextLine();
            strArray.add(s);
        }
        // System.out.println(Arrays.toString(strArray.toArray()));
        String sMin = strArray.get(0);
        int minn = strArray.get(0).length();
        for (int i = 1; i<n; i++){
            if (strArray.get(i).length()<minn){
                minn = strArray.get(i).length();
                sMin = strArray.get(i);
            }
        }
        // System.out.println("sMin: "+sMin);
        // System.out.println("minn: "+minn);
        char c;
        String ans = "";
        int flag = 0;
        for (int i = 0; i<minn; i++){
            c = sMin.charAt(i);
            // System.out.println("Char: "+c);
            // System.out.println(c);
            for (int j = 0; j<n; j++){
                // System.out.println("j: "+j);
                // System.out.println("Ans: "+ans);
                if (strArray.get(j).charAt(i) != c){
                    flag = 1;
                    break;
                }
            }
            if (flag  == 1){
                break;
            }
            ans+=c;
        }
        myObj.close();
        return ans;
    }
    public static void main(String args[]){
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String answer = obj.prefix();
        System.out.println("Longest common prefix: "+answer);
    }
}