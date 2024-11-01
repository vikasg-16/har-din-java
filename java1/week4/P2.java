import java.util.*;

// factorial

class P2{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int fact=findfact(n);
System.out.println("Factorial: "+fact);
}

public static int findfact(int num){

if(num==0 || num==1){
return 1;  
}
else{
return num*findfact(num-1);
}

}
}