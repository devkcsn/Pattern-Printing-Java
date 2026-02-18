
import java.util.Scanner;

class Pattern47 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter no of lines");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
