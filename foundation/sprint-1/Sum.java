import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size should be greater than 0");
            return;
        }
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum +=arr[i];
        }
        
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
