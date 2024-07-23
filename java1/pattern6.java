import java.util.*;
import java.util.Scanner;

//This code will print pattern of right angled triangle made of numeric value or one side triangle made of numeric value

public class pattern6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of triangle: ");
        int l=s.nextInt();
        for (int i = 0; i <=l; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(""+j);
            }
            System.out.println();
        }
    }
}
