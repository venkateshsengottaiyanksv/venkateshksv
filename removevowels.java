package ksvp;
import java.util.Scanner;
public class removevowels {
public static void main(String[] args) {
		// TODO Auto-generated method stub
   String d;
   Scanner scan = new Scanner (System.in);
   d = scan.nextLine().toLowerCase();
   String r=d.replaceAll("a","");
  String  r1=r.replaceAll("e","");
   String r2=r1.replaceAll("i","");
  String r3=r2.replaceAll("o","");
   String r4=r3.replaceAll("u","");
	 StringBuffer sb =new StringBuffer(r4);
	 System.out.println(sb.reverse());
   }}
   
	


