import java.util.*;
import java.util.Scanner;
//this code is to print rectangular pattern
public class pattern1{
public static void main(String []args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a length of pattern:");
int l=s.nextInt();
System.out.println("Enter a breadth of pattern:");
int b=s.nextInt();

for(int i=0;i<l;i++){
for(int j=0;j<b;j++){
System.out.print("*");
}
System.out.print("\n");
}
}
}