import java.util.Scanner;

public class Pattern30 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your input: ");
        int rows = sc.nextInt();
        System.out.println("Here is your desired pattern: ");
        for (int i = 1; i <= rows; i++) {
            int nums = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(nums + " ");
                nums = nums + rows - j;
            }
            System.out.println(" ");
        }
    }
}