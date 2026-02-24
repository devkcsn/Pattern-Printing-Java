public class Pattern46 {
    public static void main(String[] args) {
        int n = 7; // number of rows
        
        for (int i = 1; i <= n; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            // Print asterisks with spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Move to next line
            System.out.println();
        }
    }
}
