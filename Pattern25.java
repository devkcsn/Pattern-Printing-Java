import java.util.Scanner;

public class Pattern25 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the no of rows ");
        int rows = sc.nextInt();
        System.out.println("Here is your Pattern ");
        for (int i = 1; i <= rows; i++) {
            for (int nos = 0; nos < i; nos++) {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

        for (int k = 1; k < rows; k++) {
            for (int nos = 1; nos <= rows - k; nos++) {
                System.out.print(" ");
            }
            for (int l = rows - k; l <= rows; l++) {
                System.out.print(l + " ");
            }
            System.out.println(" ");
        }
    }
}