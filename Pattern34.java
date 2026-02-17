import java.util.Scanner;

public class Pattern34 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Here is your desired pattern: ");

        for (int i = 1; i <= rows; i++) {
            for (int nos = 0; nos < i; nos++) {
                System.out.print("*");
            }
            System.out.print(i);
            for (int nos = 0; nos < i; nos++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}