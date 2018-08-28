package ksvp;
import java.util.Scanner;
public class uppertolowercaselowertouppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan = new Scanner (System.in);
  String s = scan.nextLine(),s2="";
  for(int i=0;i<s.length();i++){ 
  	if(s.charAt(i)>=65 && s.charAt(i)<=90 ){
  		s2=s2+String.valueOf(s.charAt(i)).toLowerCase(); 
  }else{
  		s2=s2+String.valueOf(s.charAt(i)).toUpperCase(); 
  	}
  	}System.out.println(s2);
}
	}
		
		
	


