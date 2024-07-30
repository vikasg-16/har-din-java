import java.util.*;
import java.util.Scanner;

//This code will print pattern of right angled triangle starts from right hand side or one side triangle.
public class pattern5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of triangle: ");
        int l=s.nextInt();
        for (int i = 1; i <= l ; i++) {
            for (int j = l-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
