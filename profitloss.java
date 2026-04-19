import java.util.*;
class Utility {

	public static int calculateProfitLoss(Integer costPrice, Integer sellingPrice) {
	    if(costPrice<sellingPrice){
	        int profit=sellingPrice-costPrice;
	       System.out.println("Profit is made"+profit);
	    }else{
	        int loss=costPrice-sellingPrice;
	       System.out.println("loss made is -"+loss);
	        
	    }
		// write your code here
		return 0;
    }
}

class profitloss {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in); 
		int inputString = in.nextInt();
        int inputString2 = in.nextInt();
        

       
        int result = Utility.calculateProfitLoss(inputString,inputString2); 
        System.out.println(result);
	}

}