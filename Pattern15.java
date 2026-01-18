
import java.util.Scanner;

public class Pattern15 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the no of rows ");
        int rows = sc.nextInt();
        System.out.println("here is your pattern ");

        for (int i = 1; i <= rows; i++) {
            for (int nos = 0; nos < i - 1; nos++) {
                System.out.print(" ");
            }
            for (int no = rows - i + 1; no > 0; no--) {
                System.out.print(no);
            }
            System.out.println(" ");
        }
        sc.close();
    }

}
