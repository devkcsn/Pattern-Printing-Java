import java.util.Scanner;

public class Pattern26 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String [] args){
        System.out.println("Enter the no of rows for your pattern ");
        int rows = sc.nextInt();
        System.out.println("Here is your Pattern");

        for(int noc = 1 ; noc <= rows ; noc++){
            for(int nor = 1 ; nor <= noc ; nor++){
                if(nor%2 == 0 ){
                    System.out.print(0 );
                }
                else{
                    System.out.print( 1);
                }
            }
            System.out.println( " ");
        }
    }
}
