import java.util.Scanner;

public class Pattern36 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your desired no of rows ");
        int rows = sc.nextInt();
        System.out.println("Here is your desired pattern: ");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println(" ");
        }
        sc.close();
    }
}