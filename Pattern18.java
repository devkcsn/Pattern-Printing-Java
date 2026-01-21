
import java.util.Scanner;

public class Pattern18 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the no of rows ");
        int rows = sc.nextInt();
        System.out.println("Here is your Pattern ");
        
        for(int i = 1 ; i<= rows ; i++) {
            for(int nos = 1 ; nos<= rows-i ; nos++){
                System.out.print(" ");
            }
            for(int no = i ; no < 2*i  ; no++ ){
                System.out.print(no + " ");
            }System.out.println(" ");
        }
    }
}
