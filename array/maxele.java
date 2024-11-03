import java.util.*;

//this program is for finding max element in arrray
public class maxele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter the element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }  
        int max=arr[0];
        for (int j : arr) {
            if(j>max){
                max=j;
            } 
        }
        System.out.println(max+" ");
    }
    

}
