import java.util.*;
//this program is to count specific integer
public class counting_int {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter a element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to find the count:");
        int find=sc.nextInt();
        int count=0;
        for (int k : arr) {
            
            if(k==find){
                count++;
            }
        }
        System.out.println(" "+count);
    }
}
