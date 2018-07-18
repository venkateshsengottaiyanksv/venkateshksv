package ksvp;
import java.util.Scanner;
public class squarenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b,c=0;
      Scanner scan = new Scanner (System.in);
      a = scan.nextInt();
      while(a!=0){
    	  b=a%10;
    	  c=c+(b*b);
    	  a=a/10;
      }System.out.println(c);  
      }
}


