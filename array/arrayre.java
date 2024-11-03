import java.util.*;

/**
 * array reverse
 */
public class arrayre {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reversed array:");
        for(int j:arr){
            System.out.println(" "+j);
        }

    }
}