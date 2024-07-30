// This program is to reverse an Integer array  

import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number of element in an array:");
        int n=s.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        reversearray(arr);
        System.out.println("your reversed array:");
        for (int j : arr) {
            System.out.println(j+" ");
        } 
            
            
        }
    

     public static void reversearray(int []arr){
        int left =0;
        int right = arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
    }
    
}
