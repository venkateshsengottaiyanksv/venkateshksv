package ksvp;
import java.util.Scanner;
public class isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s,s1;
  Scanner scan= new Scanner(System.in);
  s= scan.next();
  s1=scan.next();
  int cnt=1;
  if(s.length()==s1.length()){
	  for(int i=0;s.length()!=0&&s1.length()!=0;i++){
		  for(int j=i+1;j<s.length();j++){
			  if(s.charAt(i)==s.charAt(j)){
				  if(s1.charAt(i)!=s1.charAt(j)){
					  System.out.println("No");
					  return;
				  }
			  }
		  }
		  s=s.replace(String.valueOf(s.charAt(i)),"");
		  s1=s1.replace(String.valueOf(s1.charAt(i)),"");
		  i--;
	  }
  }
  else{
	  System.out.println("No");
	  return;
  }
  if(s.length()==s1.length())
  System.out.println("Yes");
  else System.out.println("No");
	}

}
