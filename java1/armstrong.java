// This program will provide you the solution for armstrong number

import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=s.nextInt();
        checkarmstrong(num);
        

        
    }

    public static void checkarmstrong(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int r= n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if (temp==sum) {
            System.out.println("Number is armstrong: "+sum);
            
        } else {
            System.out.println("Number is not armstrong");
            
        }
    }

    
}