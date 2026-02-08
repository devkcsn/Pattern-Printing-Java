
import java.util.Scanner;

public class Pattern7 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int rows;
        System.out.println("Enter the no of rows ");
        rows = sc.nextInt();
        System.out.println("Here is your Pattern ");

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
        }
        sc.close();
    }
}
