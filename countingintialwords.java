package ksvp;
import java.util.Scanner;
public class countingintialwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
    Scanner scan = new Scanner(System.in);
    String s;
    	s=scan.nextLine();
    	String a[]=s.split(" ");
    	for(int i=0;i<a.length;i++){
	   count++;
   }System.out.println(count);
    
	}}


