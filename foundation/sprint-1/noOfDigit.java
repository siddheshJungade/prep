/*Finding the Number of Digits in a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to count the number of digits in a given number.
Example:
Input: number = 12345
Output: 5
Explanation: The number 12345 has 5 digits.
 */

import java.util.Scanner;

public class noOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int digit = 0;


        while (num > 0) {
            digit++;
            num /=10;
        }
        System.out.println(digit);
    }
}
