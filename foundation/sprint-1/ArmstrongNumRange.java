/*Checking for Armstrong Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find all Armstrong numbers within a given range.
Example:
Input: range = [1, 500]
Output: [1, 153, 370, 371, 407]
Explanation: Armstrong numbers between 1 and 500 are 1, 153, 370, 371, and 407.
 */

import java.util.Scanner;

public class ArmstrongNumRange {
    public static boolean isArmStrongNum(int num) {
        int originalNum = num;
        int result = 0;
        int length = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, length);
            num /= 10;
        }
        return result == originalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();
        System.out.println("Armstrong numbers in the range [" + start + ", " + end + "]:");
        for (int i = start; i <= end; i++) {
            if (isArmStrongNum(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
