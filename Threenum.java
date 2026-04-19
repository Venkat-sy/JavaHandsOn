public class Threenum {
    public void greatnum(int x,int y,int z){
        if(x>y&& y>z)
        {
     System.out.println(x);
        }
        if(y>z&& z>x)
        {
     System.out.println(y);
        }
        if(z>y&& y>x)
        {
     System.out.println(z);
        }
        
    }

    public static void main(String[] args) {
        
    Threenum th=new Threenum();  
   // Scanner sc=new Scanner(System.in);

    int num1;
    int num2;
    int num3;
    th.greatnum(10,23,12);
    }


    




    
}
