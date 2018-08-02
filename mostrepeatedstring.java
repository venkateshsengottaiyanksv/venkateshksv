package ksvp;
import java.util.Scanner;
public class mostrepeatedstring {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	  char max=0;
    String s;
    Scanner scan = new Scanner(System.in);
    s = scan.nextLine();
    for(int i=1;i<s.length();i++){
    for(int j=i+1;j<s.length();j++)	{
    	 if(s.charAt(i)==s.charAt(j)){
    		max=s.charAt(i);
    	 } }}
    		 System.out.println(max);
    		
    	
    }}

    
	


