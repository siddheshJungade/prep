/** Determining Even/Odd Numbers
Difficulty: Easy
Topics: Basic Programming
Description: Write a program to check whether a number is even or odd.
Example:
Input: number = 4
Output: Even
Explanation: Since 4 is divisible by 2, it is an even number.
*/

import java.util.Scanner;




/**
 * odd-even
 */
public class OddEven {

    static String findOddEven(int i ) {
        return i % 2 == 0? "Even" : "Odd"; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =  sc.nextInt();
        String ans = findOddEven(i);
        System.out.println("ANS: " + i + " is " + ans);
    }
    
}