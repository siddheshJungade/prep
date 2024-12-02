/*Finding the Largest and Smallest Numbers in an Array
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find the largest and smallest numbers in an array.
Example:
Input: array = [4, 7, 1, 8, 5]
Output: Largest: 8, Smallest: 1
Explanation: The largest number in the array is 8 and the smallest is 1.
 */

import java.util.Scanner;
public class findLargestSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Array size should be greater than 0");
            return;
        }
        
        int[] arr = new int[n];
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < smallest) {
            smallest = arr[i];
            }
            if (arr[i] > largest) {
            largest = arr[i];
            }
        }
        
        System.out.println("Smallest: " + smallest + " Largest: " + largest);
        sc.close();
    }
    
}
