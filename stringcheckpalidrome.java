package ksvp;
import java.util.Scanner;
public class stringcheckpalidrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan = new Scanner (System .in);
   int a = scan . nextInt(),b,c=0;
   while (a<0){
	   b = a % 10;
	   c = c + b;
	   a = a / 10;
	   }
		String s = String.valueOf(c);
		StringBuffer sb = new StringBuffer(s);
		String s1 = sb.reverse().toString();
		if(s.equals(s1)){
			System.out.println("YES");
		} else{
			System.out.println("NO");
		}
	}}
		
	


