/*Crafting Star Patterns
Difficulty: Easy
Topics: Basic Programming, Patterns
Description: Write a program to create different star patterns (e.g., pyramid, diamond).
Example:
Input: patternType = "pyramid", height = 5
Output:
    *
   ***
  *****
 *******
*********
 */

import java.util.Scanner;

public class CraftingPattern {
    static void drawPeramit(int n) {
        int i = 0;
        while(i < n){
            System.out.println(" ".repeat(n-i) + "*".repeat(i*2 + 1));
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        drawPeramit(num);
    }   
}
