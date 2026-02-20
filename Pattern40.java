import java.util.Scanner;

public class Pattern40{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String [] args){
        System.out.println("Enter the no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Here is your pattern: ");

        for(int i =1 ; i<=rows; i++){
            for(int j = i ; j<=rows ; j++){
                System.out.print(j);
            }
            for(int k=1 ; k<i ; k++){
                System.out.print(k);
            }
            System.out.println(" ");
        }
    }
}