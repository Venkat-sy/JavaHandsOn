import java.util.*;

public class coinChange2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // number of $5 coins
        int y = sc.nextInt(); // number of $1 coins
        int z = sc.nextInt(); // target amount

        int xval = 5;
        int yval = 1;

        int bestFive = -1;
        int bestOne = -1;
        int minCoins = Integer.MAX_VALUE;

        // Try all possible combinations
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                int value = i * xval + j * yval;
                if (value == z) {
                    int totalCoins = i + j;
                    if (totalCoins < minCoins) {
                        minCoins = totalCoins;
                        bestFive = i;
                        bestOne = j;
                    }
                }
            }
        }

        if (bestFive != -1) {
            System.out.println(bestOne + " and " + bestFive);
        } else {
            System.out.println("NP");
        }
    }
}
