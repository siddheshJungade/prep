import java.util.Scanner;

public class reverseString {
    static StringBuilder reverseString(String str){
        return new StringBuilder(str).reverse();
    }
    static String reverse(String str) {
        String s = "";
        for(int i = str.length()-1 ; i >= 0 ; i--) {
            s += str.charAt(i);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String ans = reverse(i);
        StringBuilder ans1 = reverseString(i);
        System.out.println("ANS: " + ans);
        System.out.println("ANS 1: " + ans1);
    }
}
