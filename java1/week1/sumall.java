//This Program is about to provide sum all digits present in a integer.

import java.util.Scanner;

public class sumall {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=s.nextInt();
        int sumall=sumalldigits(num);
        System.out.println("Sum of all digits are: "+sumall);
    }

    public static int sumalldigits(int n){
        int sum=0;
        while (n!=0) {
            
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
    
}
