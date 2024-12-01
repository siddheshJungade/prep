/* Generating the Fibonacci Series
Difficulty: Easy
Topics: Basic Programming, Sequences
Description: Write a program to generate the Fibonacci series up to a given number.
Example:
Input: limit = 10
Output: [0, 1, 1, 2, 3, 5, 8]
Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class fibonachi {
    static ArrayList<Integer> generateFibSeries(int num) {
        ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(0, 1));
        while (true) {
            int next = ans.get(ans.size() - 1) + ans.get(ans.size() - 2);
            if (next > num) break;
            ans.add(next);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("ANS: " + generateFibSeries(num));
    }
}
