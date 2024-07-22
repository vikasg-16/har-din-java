import java.util.*;
import java.util.Scanner;

//This code will print pattern of invert right angled triangle or invert one side triangle

public class pattern4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of triangle: ");
        int l=s.nextInt();

        for (int i = l; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }


    }
    
}
