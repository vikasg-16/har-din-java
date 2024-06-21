// The java program is about finding the factorials(!) of a number provided by the user 
// 4!=4*3*2*1 = 24

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=s.nextInt();
        int factorial=findfactorial(num);
        System.out.println("Factorial of a number is:"+factorial);
        s.close();
    }

    public static int findfactorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n*findfactorial(n-1);
            
        }
    }
    
}
