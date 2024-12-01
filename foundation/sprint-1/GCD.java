/* Finding the Greatest Common Divisor (GCD)
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find the GCD of two numbers.
Example:
Input: a = 48, b = 18
Output: 6
Explanation: The GCD of 48 and 18 is 6.
 */

import java.util.Scanner;

public class GCD {

    static int gcdR(int a , int b) {
        if(b == 0){
            return a;
        }
        return gcdR(a, a%b);
    }

    static int gcd(int a , int b) {
        int min = Math.min(a, b);
        System.out.println(min);
        while (min >= 1) {
            if(a%min == 0 && b%min== 0){
                return min;
            }
            min--;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("ANS: " + gcd(num1,num2));
           
    }
}
