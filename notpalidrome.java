package ksvp;
import java.util.Scanner;
public class notpalidrome {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan =new Scanner (System.in);
	String s=scan .nextLine();
	StringBuilder sb = new StringBuilder(s);
	String s1 = sb.reverse().toString();
	if(s1.equals(s)){
		String s2=s.substring(0,s.length()-1);
		System.out.println(s2);
	}else{
		System.out.println(s);
	}
}}
	
	
	

	


