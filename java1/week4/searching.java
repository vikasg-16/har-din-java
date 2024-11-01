//this program is for all searching algorithm used in array
import java.util.*;
public class searching {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of array:");

        // Linear search technique
        for(int i=0;i<=n-1;i++){
            arr[i]=s.nextInt();
        }
        
        System.out.println("Enter the key you want to find:");
        int key=s.nextInt();
        for (int i = 0; i <= arr.length; i++) {
            if(arr[i]== key){
                System.out.println("founded "+key+" at:"+i);
            } 
        }

        // Binary search technique ,it required a sorted array
        int left=0;
        int right=arr.length-1;
        if(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==key){
                System.out.println("Key founded: "+key);
            }
            if(arr[mid]<key){

            }
        }
        

        s.close();
    }
}
