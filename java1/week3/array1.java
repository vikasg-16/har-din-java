package week3;
import java.util.*;
//this just for practing 1d array

public class array1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size =s.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
        }
        System.out.println("Enter a number to find: ");
        int n=s.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i]==n) {
                System.out.println("Index of an element: "+ i);
            } 
        }
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(array[i]);
        // }
    }
}
