import java.util.Scanner;

public class Pattern38{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("Enter the no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Here is your pattern: ");

        for(int i= 1 ; i<=rows ; i++){
            for(int j =1 ; j<=i ; j++){
                if(j != i){
                    System.out.print(j + "*");
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