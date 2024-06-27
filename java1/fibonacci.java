//This program is for providing fibonaaci series
//for ex:if you want 5 fibonaaci series it will provide you the sum of 5 numbers
//(0+1)=1;(1+1)=2;(2+3)=5;(5+4)=9;[(9+5)=14]-final value 

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of series: ");
        int n=s.nextInt();
        int first=0;
        int second=1;
        int next;
        System.out.println("Fibonacci series is:\n"+first+" \n"+second+" ");

        for(int i=2;i<n;i++){
            next=first+second;
            System.out.println(next+" ");
            first=second;
            second=next;
        }
        s.close();    
    }

    

        

    
    
}
