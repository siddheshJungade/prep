import java.util.Scanner;

public class mathTable {
    public static void multiplyTable(int num) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        multiplyTable(num);
        sc.close();
    }
}
