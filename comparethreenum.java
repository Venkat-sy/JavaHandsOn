public class comparethreenum {
    public void compare(int x,int y,int z){
        if(x==y &&z==x){
            System.out.println("All are equal");
        }
        else if(x==y | x==z | z==y){
            System.out.println("either all are equal or different");
        }else{
            System.out.println("all are different");
        }
    }
    public static void main(String[] args) {
        comparethreenum c=new comparethreenum();
        c.compare(10,20,30);
    }
    
}
