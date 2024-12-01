/* Identifying Palindromes
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to check if a string or number is a palindrome.
Example:
Input: string = "radar"
Output: Palindrome
Explanation: "radar" reads the same backward as forward.
 */
import java.util.Scanner;
public class Palandrome {
    static boolean isPalandrome(String str) {
        int i = 0; 
        int j = str.length() - 1;
        while (i < j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            } 
            j--;i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i =  sc.nextLine();
        boolean ans = isPalandrome(i);
        System.out.println("ANS: " + i + " isPalandrome " + ans);
    }
}
