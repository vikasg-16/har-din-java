// This program will provide an array with removed duplicate part

import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number of elements/size of array: ");
        int n=s.nextInt();
        int [ ]arr=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int []uniquearr=removeduplicate(arr);
        // System.out.println("Elements are: ");
        // for (int j=0;j<arr.length;j++) {
        //     System.out.println(arr[j]);
        // }
        
        
    }

    public static int removeduplicate(int []arr){
        int []uniquearr=new int[arr.length];
        int l=0;
          

        return uniquearr;
    }
    
}
