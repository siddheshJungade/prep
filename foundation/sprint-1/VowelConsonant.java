/*Counting Vowels and Consonants in a String
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to count vowels and consonants in a given string.
Example:
Input: string = "hello world"
Output: Vowels: 3, Consonants: 7
Explanation: "hello world" contains 3 vowels (e, o, o) and 7 consonants (h, l, l, w, r, l, d).
 */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class VowelConsonant {

    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    static Map<String, Integer> countVowelsAndConsonants(String str) {
        Map<String, Integer> data = new HashMap<>();
        data.put("vowels", 0);
        data.put("consonants", 0);

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    data.put("vowels", data.get("vowels") + 1);
                } else {
                    data.put("consonants", data.get("consonants") + 1);
                }
            }
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        Map<String, Integer> result = countVowelsAndConsonants(input);
        System.out.println("Vowels: " + result.get("vowels") + ", Consonants: " + result.get("consonants"));
    }
}
