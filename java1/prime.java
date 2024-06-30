import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Prime Number: ");
        int num=s.nextInt();
        if (num==0 || num==1) {
            System.out.println("Number is not a prime number");
        } else {
            if (num%2==0) {
                System.out.println("Number is not a prime number");
            } else {
                System.out.println("Number is prime number");
            }
        }
       
        
    }
    
    
    
}
