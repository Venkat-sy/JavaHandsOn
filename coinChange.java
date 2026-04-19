import java.util.*;
public class coinChange {
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    int x;
     int y,z;
   // Scanner sc=new Scanner(System.in);
    x=sc.nextInt();
     y=sc.nextInt();
      z=sc.nextInt();
    int xval=5;
    int yval=1;
    int n,m;
    int bestf=-1;
 int besto=-1;
 int mincoin=Integer.MAX_VALUE;

    for(int i=0;i<=x;i++){
        for(int j=0;j<=y;j++){
            int value=i*xval+j*yval;
            if(value==z){
                System.out.println(+i+"   "+j);
                int totalcoins=i+j;
                if(totalcoins<mincoin){
                    mincoin=totalcoins;
                    bestf=i;
                    besto=j;
                    
                }

              
            }

            }
        
        }
        if(bestf!=-1){
            System.out.println(bestf+"  "+besto);
        }else{
            System.out.println("vklnshjv");
        }
    }


    }



    
