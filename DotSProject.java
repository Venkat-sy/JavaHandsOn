import java.util.Scanner;
public class DotSProject {
    
    public static class NewClass
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers");
     int num1=sc.nextInt();
     int num2=sc.nextInt();
     int num3=sc.nextInt();
     if(num1<num2 && num2<num3)
     {
         System.out.println("numbers are in increasing order");
     }
     else if(num1>num2 && num2>num3)
     {
         System.out.println("Decreasing order");
     }
     else
     {
         System.out.println("Unordered");

    }

    
}}
}
