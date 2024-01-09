/*Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that "pwke" is a subsequence and not a substring.
*/
import java.util.Scanner;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = myObj.nextLine();
        int maxx = 0;
        String neww = "";
        String ans;
        for (int i = 0; i<s.length()-1; i++){
            for (int j = i+1; j<s.length(); j++){
                if (neww.indexOf(s.charAt(j)) == -1){
                    neww+=s.charAt(j);
                } else {
                    if (neww.length()>maxx){
                        maxx = neww.length();
                        ans = neww;
                        neww = "";
                    }
                }
            }
        }
        System.out.println("String: "+neww);
        System.out.println("Length: "+maxx);
    }
}
