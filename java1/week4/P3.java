import java.util.*;

// palindrome check
class P3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String st = s.nextLine();
        boolean check = Palindrome(st);
        System.out.println("Is the string a palindrome? " + check);
    }

    public static boolean Palindrome(String ch) {
        int left = 0;
        int right = ch.length() - 1;  // Corrected 'lenght()' to 'length()'

        while (left < right) {
            if (ch.charAt(left) != ch.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
