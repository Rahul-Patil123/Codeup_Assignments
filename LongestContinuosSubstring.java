/**
 * Author: Rahul Ganeshwar Patil
 * Date: September 03, 2024
 * 
 * Problem Description:
 * [This Program helps to return the Length of maximum substring without any repetition]
 */
import java.util.*;
public class LongestContinuosSubstring {
    static int solve(String s) {
        HashMap<Character,Integer> mpp = new HashMap<Character, Integer> ();

        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right<n) {
            if(mpp.containsKey(s.charAt(right))) {
                left = Math.max(mpp.get(s.charAt(right))+1,left);
            }
            mpp.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter input string: ");
        String str=sc.nextLine();
        System.out.println("The length of maximum substring is:");
        System.out.println(solve(str));
        sc.close();
    }
}
