package week3;
import java.util.*;
// this is practing 2d array

public class array2 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an 2d array: ");
        int row =s.nextInt();
        int column = s.nextInt();
        int [] []array =new int[row] [column];
        System.out.println("Enter the elements of 2D array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = s.nextInt();
            }
        }
        System.out.println("Element to find :");
        int n=s.nextInt();
        for (int i = 0; i < row; i++) {
           for (int j = 0; j < column; j++) {
            if (array[i][j] == n) {
                System.out.println("element is :"+i+" "+j ); 
            }
                
           }
           System.out.println(); 
        }
    }
}