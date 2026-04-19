public class aritemetic {
    public static int add(int a, int b) {
        return a + b;
    }
     public static int sub(int a, int b) {
        return a - b;
    }
    
     public static int mul(int a, int b) {
        return a *b;
    }
    
     public static int div(int a, int b) {
        return a / b;
    }
     public static int mod(int a, int b) {
        return a % b;
    }
    
public static void main(String[] args) {
    int x,y;
   // System.out.println("Enter the method number:");
    aritemetic a=new aritemetic();
  int additition=  a.add(20,2);
  int substraction=  a.sub(20,5);
   int multiplication= a.mul(20,5);
  float didision=   a.div(20,5);        
   float modulous= a.mod(40,23);
   System.out.println("additition of 20 and 2 is "+additition); 
   System.out.println("substraction of 20 and 5 is "+substraction);
   System.out.println("multiplication of 20 and 5 is "+multiplication);         
    System.out.println("division of 20 and 5 is "+didision);
    System.out.println("modulous of 40 and 23 is "+modulous);
        

}
    
}
