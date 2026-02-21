import java.util.Scanner;

public class Pattern44 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Here is your desired patterm: ");

        for (int i = 1; i <= rows; i++) {
            for (int nos = 1; nos <= rows - i; nos++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }
}
