package ksvp;
import java.util.Scanner;
public class spacereverseoneword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s;
  Scanner scan = new Scanner(System.in);
  s = scan.nextLine();
  String s1[]=s.split(" ");
  for(int i=0;i<s1.length;i++){
StringBuilder ss=new StringBuilder(s1[i]);
System.out.print(ss.reverse()+" ");
  }
  
	}

}
