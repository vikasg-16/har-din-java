//The code is for palindrome i.e. to check weather the string is revert is it same as previous or not
//Ex radar is revert will be radar only 
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String to be Checked:");
        String str= s.nextLine();
        boolean ispalindrome= checkpalindrome(str);
        System.out.println(str+" is palindrome "+ispalindrome);
    }

    public static boolean checkpalindrome(String str){

        int left=0;
        int right=str.length()-1;

        while (left < right) {
            if (str.charAt(left)!=str.charAt(right)) {
                return false;
            } 
            left++;
            right--;
        }
        return true;

    }
    
}
