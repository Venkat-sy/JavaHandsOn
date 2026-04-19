import java.util.*;
public class lettercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          String c;
           c=sc.nextLine();
           char ch=c.charAt(0);
      	
		     if(ch>='A' && ch<='Z'){
		    System.out.println("Uppercase");
		}else{
		    System.out.println("Lower case");
		}
		
	}
}
