import java.util.*;
import java.util.Scanner;

// This code is to print pattern which makes border of a shape i.e. square or rectangle based on your //input

public class pattern2{
public static void main(String []args){

Scanner s=new Scanner(System.in);
System.out.println("Enter a number of length");
int l=s.nextInt();
System.out.println("Enter a number of breadth");
int b=s.nextInt();
for(int i=1;i<=l;i++){
for(int j=1;j<=b;j++){
if(i==1 || j==1 || i==l || j==b )
{
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}




