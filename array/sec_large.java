import java.util.*;
//this program is to find second largest element in array 
public class sec_large {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("ENter the element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int num=arr[arr.length-2];
        System.out.println("Second largest number: "+num);
    }
}
