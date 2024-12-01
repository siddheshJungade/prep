/*
Finding the Factorial of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to compute the factorial of a given number.
Example:
Input: number = 5
Output: 120
Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120.
 */

import java.util.Scanner;


public class Factorial {

    static long factorial(long i){
        return i <= 1 ? 1 : i * factorial(i-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        long ans = factorial(i);
        System.out.println("ANS: " + ans);

    }
}
