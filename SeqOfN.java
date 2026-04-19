public class SeqOfN {
    public static void sequence(int n) {
        for(int i = 0; i <= n; i++) {
            System.out.print(i + " ");  // print each number
        }
    }

    public static void main(String[] args) {
        int N = 10;
        SeqOfN.sequence(N);  // call directly since it's static
    }
}