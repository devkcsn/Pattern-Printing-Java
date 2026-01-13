
import java.util.Scanner;

public class Pattern10 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter hte numbers of rows ");
        int rows = sc.nextInt();
        System.out.println("Here is your pattern ");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
