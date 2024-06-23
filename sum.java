// Starting and practcing with basic of java
import java.util.Scanner; // importing scanner package
public class sum {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);// making object of scanner class
        System.out.println("Enter the numbers to added: ");
        int num1=s.nextInt();// taking input from user
        int num2=s.nextInt();
        int res=num1+num2;
        System.out.println("Sum of numbers is :"+res);
        s.close();
    }
    
}
