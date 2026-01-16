
import java.util.Scanner;

public class Pattern13 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the no of rows ");
        int rows = sc.nextInt();
        System.out.println("Here is your pattern ");

        for (int i = 1; i <= rows; i++) {
            for (int nos = 0; nos < i - 1; nos++) {
                System.out.print(" ");
            }
            for (int no = 1; no <= rows - i + 1; no++) {
                System.out.print(no);
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
