package ksvp;
import java.util.Scanner;
public class evenandoddswaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s;
  Scanner ss= new Scanner(System.in);
  s=ss.nextLine();
  StringBuffer s1=new StringBuffer(s.substring(0,2));
  StringBuffer s2=new StringBuffer(s.substring(2,4));
  String s3=(s1.reverse().toString()+s2.reverse());
  System.out.println(s3);
	}}
	  
  


