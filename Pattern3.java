
import java.util.Scanner;

public class Pattern3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int rows;
        System.out.println("Enter the no of rows:  ");
        rows = sc.nextInt();
        System.out.println("Here is your pattern");
        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
