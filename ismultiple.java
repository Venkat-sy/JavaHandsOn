import java.util.*;
public class ismultiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        if(n%m==0){
            System.out.println("M is multiple of N");
        }
        else{
            System.out.println("M is not a multiple of n or vice versa");
        }
        
    }
    
}
