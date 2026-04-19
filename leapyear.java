import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
       year=sc.nextInt();
       for(int i=0;i<2500;i+=4){

       
       if(year%4==0 & year%100!=0){
        System.out.println("the year is a leap year");
        break;
        
       }else if(year%400==0){
         System.out.println("the year is a leap year");
         break;
       }
       else{

       
        System.out.println("The year isnt leap year");
        break;
       }
    }}

    }
    

