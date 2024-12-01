/*
Summing Digits of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to calculate the sum of digits of a number.
Example:
Input: number = 1234
Output: 10
Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10.
 */


import java.util.Scanner;

public class SumOfDigit {
    static long sumOfDigit(long i) {
        return i == 0 ? 0 : i%10 + sumOfDigit(i/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        long ans = sumOfDigit(i);
        System.out.println("ANS: " + ans);
    }
}
