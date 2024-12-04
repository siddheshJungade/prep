/* Calculating the Sum of Even Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of all even numbers within a given range.
Example:
Input: range = [1, 10]
Output: 30
Explanation: The sum of even numbers between 1 and 10 is 2 + 4 + 6 + 8 + 10 = 30.
*/

import java.util.Scanner;

public class sumEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();
        System.out.println("Prime numbers in the range [" + start + ", " + end + "]:");
        int sum = 0;
        int sumOdd = 0;
        for (int i = start; i <= end; i++) {
            if (i%2 == 0) {
                sum += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Sum : " + sum);
        System.out.println("Sum Odd : " + sumOdd);
        sc.close();
    }
}
