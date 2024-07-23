import java.util.*;
import java.util.Scanner;

//This code will print pattern of floyd's triangle

public class pattern8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of triangle: ");
        int l=s.nextInt();
        int num=1;
        for (int i = 0; i <=l; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }    

}   
