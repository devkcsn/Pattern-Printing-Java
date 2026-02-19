import java.util.Scanner;

public class Pattern39 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Here is your Pattern: ");
        char  ch = 'A' ;
        for(int i= 1; i<=rows ;i++){
            for (int j = 1; j <= rows; j++) {
                if (j <= i) {
                    System.out.print(j);

                } else {
                    System.out.print(ch);
                }
            }
            ch++;
            System.out.println(" ");
        }
    }
}