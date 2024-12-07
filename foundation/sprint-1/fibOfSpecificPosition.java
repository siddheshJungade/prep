/*Finding the Fibonacci Number at a Specific Position
Difficulty: Easy
Topics: Basic Programming, Sequences
Description: Write a program to find the Fibonacci number at a specific position.
Example:
Input: position = 5
Output: 5
Explanation: The Fibonacci number at position 5 is 5 (sequence: 0, 1, 1, 2, 3, 5).
 */
import java.util.Scanner;

public class fibOfSpecificPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int prev2 = 0;
        int prev1 = 1;
        for(int i = 2 ; i <= num ; i++) {
            if(i == num) {
                System.out.println(prev1+prev2);
            } else {
                int a = prev1 + prev2;
                prev2 = prev1;
                prev1 = a;
            }
        }
    }
}
