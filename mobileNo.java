import java.util.*;

class mobileNo {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();

        if (mobile.length()==10) {
            System.out.println("Valid mobile number");
        } else {
            System.out.println("Invalid mobile number");
        }
    }
}
