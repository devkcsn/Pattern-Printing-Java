import java.util.Scanner;

public class Pattern27 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the no of rows you want to print");
        int rows = sc.nextInt();
        System.out.println("Here is your pattern");

        for (int noc = 1; noc <= rows; noc++) {
                if (noc % 2 != 0) {
                    for (int j = 1; j <= rows; j++) {
                        if (j % 2 != 0) {
                            System.out.print(1);
                        } else {
                            System.out.print(0);
                        }
                    }
                } else {
                    for (int k = 0; k < rows; k++) {
                        if (k % 2 == 0) {
                            System.out.print(0);
                        } else {
                            System.out.print(1);
                        }
                    }
                }
                System.out.println("  ");
            }
        }
    }
