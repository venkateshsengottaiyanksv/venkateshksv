package ksv;
import java.util.Scanner;
public class palidromenum {
 public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a,b=0,c=0;
  Scanner scan = new Scanner (System.in);
  a = scan.nextInt();
  int d=a;
	  while(a!=0){
		  b = a%10;
		  c=c*10+b;
		  a=a/10;
  }
	  if(c==d){
		  System.out.println("palidrome");
	  }
	 else{
		System.out.println("no palidrome"); 
	 }
	}

}
