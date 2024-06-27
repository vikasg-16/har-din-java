// This program is about reverse the string array
// We will be using some predefined functions of string in java language.
import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=s.nextLine();
        StringBuilder b=new StringBuilder();
        b.append(a);
        b.reverse();
        System.out.println(b+"");
        
        
        
    }
    
}
