package ksvp;
import java.util.Scanner;
public class stringnumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a;int x=0,y=0;
    Scanner scan=new Scanner(System.in);
    a= scan .nextLine();
      x = a.length();
     String s = a.replaceAll("[a-zA-Z]","");
     y = s.length();
     if(x==y){
    	System.out.println("yes");
    }else{
    	System.out.println("no");
    }
}
	}

