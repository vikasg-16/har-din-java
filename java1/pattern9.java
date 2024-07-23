import java.util.*;
import java.util.Scanner;

//This code will print pattern of right angled triangle or one side triangle

public class pattern9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of triangle: ");
        int l=s.nextInt();
        //int num=1;
        for (int i = 1; i <=l; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            
            System.out.println();
        }


    }
}
