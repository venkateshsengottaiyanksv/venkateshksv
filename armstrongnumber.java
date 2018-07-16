package ksvp;
import java.util.Scanner;
public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a,b,c=0,d;
  Scanner ss = new Scanner(System.in);
  a=ss.nextInt();
  d=a;
  while(a!=0){
	  b=a%10;
	  a=a/10;
	  c=c+(b*b*b);
  }if(c==d){
  System.out.println("yes");}
  else{
	  System.out.println("no");
  }}}
  
	


