package ex1;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   String a=s.next();
   StringBuffer b=new StringBuffer(a);
   StringBuffer reverse=b.reverse();
   if(a.equals(reverse.toString()))
   {
	   
	   
	    System.out.println("Its a palindrome");
   }
   else{
	   System.out.println("Its not a palindrome");
   }
	
	
	}

}
