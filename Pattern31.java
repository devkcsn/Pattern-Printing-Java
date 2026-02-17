import java.util.Scanner;

public class Pattern31 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the desired no of you want to print: ");
        int rows = sc.nextInt();
        System.out.println("Here is your desired Pattern: ");
        int nums = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(nums + " ");
                nums++;
            }
            System.out.println(" ");
        }
        sc.close();
    }
}