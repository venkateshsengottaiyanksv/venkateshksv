package ksvp;
import java.util.Scanner;
public class stringnumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a;
    Scanner scan=new Scanner(System.in);
    a= scan .nextLine();
    for(int i=0;i<a.length();i++){
    char ch=a.charAt(i);
    
    if(ch>=48 && ch<=57){
    	System.out.println("yes");
    }else{
    	System.out.println("no");
    }
	break;}
	}
}
