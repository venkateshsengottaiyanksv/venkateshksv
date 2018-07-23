package ksvp;
import java.util.Scanner;
public class countingwords {
public static void main(String []args){
	String a;int count =0;
	Scanner scan = new Scanner(System.in);
	a = scan.nextLine();
	String s=a.replace(" ","");
	for(int i=0;i<s.length();i++){
		count++;
	}System.out.println(count);
	
	
	
	
}}
