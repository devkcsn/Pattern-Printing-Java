
import java.util.Scanner;

public class Pattern20 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter no of rows ");
        int rows = sc.nextInt();
        System.out.println("Here is your Pattern ");

        for (int i = 1; i <= rows; i++) {
            for (int nos = 0; nos < i - 1; nos++) {
                System.err.print(" ");
            }
            for (int no = 1; no <= rows-i+1; no++) {
                System.out.print((rows - i + 1) + " ");
            }
            System.out.println(" ");
        }

    }
}
