
import java.util.Scanner;

public class Pattern8 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int rows;
        System.out.println("Enter the no of rows");
        rows = sc.nextInt();
        System.out.println("Here is your pattern");
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i + 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
