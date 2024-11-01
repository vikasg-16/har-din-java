import java.util.*;

// Sum of digits

class P1{
public static void main(String args[]){

Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=0;
while(n!=0){
int r=n%10;
sum+=r;
n=n/10;
}
System.out.println("Sum: "+sum);
}

}