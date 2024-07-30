import java.util.*;
import java.util.Scanner;

//This code will print pattern of right angled triangle or one side triangle

public class pattern3{
public static void main(String [] args){

Scanner s=new Scanner(System.in);
System.out.println("Enter a number of rows:");
int r=s.nextInt();
for(int i=1;i<=r;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
}

}