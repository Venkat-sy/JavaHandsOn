import java.util.Scanner;
public class bitwisemulti{
    public static int multiplyByTwo(int number){
        int product = number << 1;
        return (product);
    }

    public static int divideByTwo(int number){
        int product = number >> 1;
        return (product);
    }
    public static void main(String[] arr){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(bitwisemulti.multiplyByTwo(number)+","+bitwisemulti.divideByTwo(number));
    }
}
    

