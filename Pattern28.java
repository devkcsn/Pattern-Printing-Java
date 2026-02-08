import java.util.Scanner;

public class Pattern28 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the no of lines / input you want to print: ");
        int col = sc.nextInt();
        System.out.println("Your desired Pattern is: ");

        for (int i = 1; i <= col; i++) {
            for (int k = 1; k <= col - i; k++) {
                System.out.print(1);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}