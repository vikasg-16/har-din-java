//This program is to find max integer from a integer array

import java.util.Scanner;
public class maxel {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number of integer in array: ");
        int n=s.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the integer in a array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        int ele=maxelement(arr);
        System.out.println("Max element of an array is : "+ele);


    }
    public static int maxelement(int arr[]){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        
        return max;
    }
}
