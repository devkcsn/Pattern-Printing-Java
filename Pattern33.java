import java.util.Scanner;

public class Pattern33 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the desired no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Here is your desired pattern: ");
        int nums = 1;
        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print((nums + j) + " ");
                }
            } else {
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print((nums + j) + " ");
                }
            }
            nums = nums + i;
            System.out.println();
        }
    }
}