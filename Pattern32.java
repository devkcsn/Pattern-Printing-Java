import java.util.Scanner;

public class Pattern32 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your desired no of row: ");
        int rows = sc.nextInt();
        System.out.println("Here is your desired patern: ");
        int nums = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(nums + " ");
                nums++;
            }
            System.out.println(" ");
        }
    }
}