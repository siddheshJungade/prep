/*Finding Prime Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find all prime numbers within a given range.
Example:
Input: range = [10, 30]
Output: [11, 13, 17, 19, 23, 29]
Explanation: Prime numbers between 10 and 30 are 11, 13, 17, 19, 23, and 2
 */

import java.util.Scanner;

public class findPrimNumRange {
    static boolean isNumPrime(int num) {
        for(int i = 2 ; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();
        System.out.println("Prime numbers in the range [" + start + ", " + end + "]:");
        for (int i = start; i <= end; i++) {
            if (isNumPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
