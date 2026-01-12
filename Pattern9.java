
import java.util.Scanner;

public class Pattern9 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int rows;
        System.out.println("Enter the no of rows ");
        rows = sc.nextInt();
        System.out.println("Here is your pattern ");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
