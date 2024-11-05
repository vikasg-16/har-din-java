import java.util.*;

// this program is to remove duplicate value from an array
public class remove_duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter a element:");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr); // sorting array using predefined function
        int []unique_arr=new int[arr.length];
        int j=0;

        for (int k = 0; k < arr.length)-1; k++) {
                 if(arr[k]!=arr[k+1]){
                     unique_arr[j++]=arr[k];
                 }
             }
             unique_arr[j++]=arr[arr.length-1];


        // //Used array list for sorting easily
        // ArrayList<Integer>arrayList=new ArrayList<>();//array list creation
        // //adding element in arraylist 
        // for (Integer inte : arr) {
        //     arrayList.add(inte);
        // }
        // Collections.sort(arrayList);
        // int []unique_arr=new int[arr.length];
        // int j=0;
        // for (int k = 0; k < arrayList.size()-1; k++) {
        //     if(arrayList.get(k)!=arrayList.get(k+1)){
        //         unique_arr[j++]=arrayList.get(k);
        //     }
        // }
        // unique_arr[j++]=arrayList.get(arrayList.size() - 1);

        for (int i : unique_arr) {
            System.out.println(" "+i);
        }
    }
    
}
