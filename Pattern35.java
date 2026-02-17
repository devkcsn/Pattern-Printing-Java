import java.util.Scanner;

public class Pattern35{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("ENter your desired no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Here is your desired pattern: ");

        for(int i = 1; i<=rows ; i++ ){
            for(int j =1 ; j<= rows ; j++ ){
                if(j<=i){
                    System.out.print(j);
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        sc.close();
    }
}