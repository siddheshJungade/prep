/*Finding the Least Common Multiple (LCM)
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find the LCM of two numbers.
Example:
Input: a = 12, b = 15
Output: 60
Explanation: The LCM of 12 and 15 is 60.
 */

import java.util.Scanner;

public class LCM {

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
    static int lcm(int a,int b){
        int gcdI = gcd(a, b);
        return gcdI == -1 ? -1 : (a*b)/gcdI;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("ANS: " + lcm(num1,num2));
    }
    
}
