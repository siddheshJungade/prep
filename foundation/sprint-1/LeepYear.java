/*Validating Leap Years
Difficulty: Easy
Topics: Basic Programming, Date Handling
Description: Write a program to check if a given year is a leap year.
Example:
Input: year = 2020
Output: Leap Year
Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by 400, so it is a leap year.
 */

import java.util.Scanner;

public class LeepYear {
    static boolean isLeepYear(int num){
        if((num%4 == 0 && num%100 != 0) || num%400 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int year = sc.nextInt();
        boolean ans = isLeepYear(year);
        System.out.println("ANS: " + year + " Year is leep year :" + ans);
    }
}
