public class power {
    int getpower(int a,int b)
    {
 int res=1;
 for(int i=1;i<=b;i++){
    res=res*a;


 }
    return res;

}
public static void main(String[] args) {
    power p=new power();

    int num1=3;
    int num2=4;
    int result=p.getpower(num1,num2);
    System.out.println(result);
    
}
}
