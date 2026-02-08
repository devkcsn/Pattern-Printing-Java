import java.util.Scanner;
public class Pattern29{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("Enter the no of col / inputs you want to print: ");
        int col = sc.nextInt();
        System.out.println("Here is your desired pattern: ");

        for(int i= 1 ; i<= col ; i++){
            for(int j = 1 ; j<=col ; j++){
                if(j==i){
                    System.out.print(i-1);
                }
                else{System.out.print(0);}
            }
            System.out.println( " ");
        }
    }
}