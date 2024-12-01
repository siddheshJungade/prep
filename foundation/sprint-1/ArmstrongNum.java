/*Calculating Armstrong Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to check if a number is an Armstrong number.
Example:
Input: number = 153
Output: Armstrong Number
Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNum {
    static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int n = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }

        return originalNum == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean ans = isArmstrong(num);
        System.out.println("ANS: " + num + " isArmstrong: " + ans);
    }
}
