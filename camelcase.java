package ksvp;
import java.util.Scanner;
public class camelcase {
public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s;
 Scanner ss=new Scanner(System.in);
 s=ss.nextLine();
 String s1[]=s.split(" ");
for(int i=0;i<s1.length;i++){
	s1[i]=s1[i].substring(0, 1).toUpperCase()+s1[i].substring(1);
	System.out.print(s1[i]);
	if(i!=s1.length-1)System.out.print(" ");
}
}}
