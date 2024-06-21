// Even odd program can be implemented using many methods i m trying the easiest i.e brutforce method.
// It can be implemented making differnt class for even odd checking. 
import java.util.Scanner;

/**
 * evenodd
 */
public class evenodd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=s.nextInt();
        if(num%2==0){
            System.out.println("Number is Even:"+num);
        }
        else{
            System.out.println("Number is Odd:"+num);
        }
    }
    
}
