
import java.util.Scanner;

public class Pattern14 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter no of rows ");
        int rows = sc.nextInt();
        System.out.println("here is your Pattern ");

        for (int i = 1; i <= rows; i++) {
            for (int nos = 1; nos <= rows - i + 1; nos++) {
                System.out.print(" ");
            }
            for (int no = i; no > 0; no--) {
                System.out.print(no);
            }
            System.out.println(" ");
        }
        sc.close();
    }

}
