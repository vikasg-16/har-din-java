// This is basic code in which if atm have only 1000,500,100,50 notes only
//if user required 5500 amount the output should provide number of notes given to user
// the atm doesn't have coin input it should display invalid input  

import java.util.*;
import java.util.Scanner;

public class atm{

public static void main(String []args){

Scanner s=new Scanner(System.in);
System.out.println("Enter the amount:");
int n=s.nextInt();
if (n % 10 !=0){
System.out.println("Amount is invalid");
}

int thousandNotes = n/1000; // to know number of 1k notes required (6000/1000=6)
n%=1000; // to terminating the digit at place thousands place

// repeat the steps for rest of notes

int fivehundredNotes = n/500;
n%=500;

int hundredNotes = n/100;
n%=100;

int fiftyNotes =n/50;
n%=50;

int tenNotes =n/10;
n%=10;

System.out.println("Thousand Notes required for amount: "+thousandNotes);
System.out.println("Five hundreds Notes required for amount:"+fivehundredNotes);
System.out.println("Hundred Notes required for amount:"+hundredNotes);
System.out.println("Fifty Notes required for amount:"+fiftyNotes);
System.out.println("Ten Notes required for amount:"+tenNotes);

}
}