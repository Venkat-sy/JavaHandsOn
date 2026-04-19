import java.util.Scanner;

class SumOfN {
    public static int sumTillN(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {   // loop till n
            sum = sum + i;
        }
        return sum;
    }
}

class Tester {
    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = SumOfN.sumTillN(n);   // corrected method call
        System.out.println(sum);
    }
}