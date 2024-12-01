/** Checking for Prime Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to determine if a number is prime.
Example:
Input: number = 7
Output: Prime
Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.
*/

import java.util.Scanner; 

public class primeNum {
    static boolean isNumPrime(int num) {
        for(int i = 2 ; i*i <= num && num % i == 0; i++) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =  sc.nextInt();
        boolean ans = isNumPrime(i);
        System.out.println("ANS: " + i + " isPrime " + ans);

    }   
}
