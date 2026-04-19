class sumOfNum{
    public static void main(String[] args) {
        int n=12345;
        int sum=0;
       for(;n>0;n=n/10){
        int digit=n%10;
        sum=sum+digit;

       }
       System.out.println(sum);
       }
    }

