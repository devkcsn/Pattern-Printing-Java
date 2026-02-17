import java.util.Scanner;

public class Pattern37{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Here is your pattern: ");

        for(int i = 1; i<=rows; i = i+2){
            for(int j=1;j<=i;j++){
                if(j%2 == 0){
                    System.out.print("*");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println(" ");
        }
        sc.close();
    }
}