
import java.util.Scanner;

public class Pattern4 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int rows;
        System.out.println("Enter the no of rows");
        rows = sc.nextInt();
        System.out.println("Here is your pattern");
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print(rows - i + 1 + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
