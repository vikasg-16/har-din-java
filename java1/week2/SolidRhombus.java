import java.util.*;
// code for printing solid rhombus
public class SolidRhombus{

public static void main(String []args){
Scanner s= new Scanner(System.in);
System.out.println("Enter the length:");
int n=s.nextInt();

for(int i=1;i<=n;i++){
for(int j=1;j<=n-i;j++){
System.out.print(" ");
}
for(int j=1;j<=n;j++){
System.out.print("*");
}
System.out.println();
} 

}
}