import java.util.*;

//code to print number pyramid

public class NumberPyramid{
public static void main(String [] args){
Scanner s= new Scanner(System.in);
System.out.println("Enter the length:");
int n= s.nextInt();

for(int i=1;i<=n;i++){
for(int j=1;j<=n-i;j++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print(i);
System.out.print(" ");
}
System.out.println();
}
}
}