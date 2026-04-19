import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read N
        int N = sc.nextInt();
        
        // First two terms
        int first = 0, second = 1;
        
        // Print the series
        for (int i = 1; i <= N; i++) {
            System.out.print(first + " ");
            
            // Calculate next term
            int next = first + second;
            first = second;
            second = next;
        }
        
        sc.close();
    }
}