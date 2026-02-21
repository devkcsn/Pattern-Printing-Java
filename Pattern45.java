import java.util.Scanner;

public class Pattern45 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the no of rows you want to print: ");
        int rows = sc.nextInt();
        System.out.println("Here is your desired pattern: ");

        for (int i = 1; i <= rows; i++) {
            for (int nos = 1; nos < i; nos++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }
}
