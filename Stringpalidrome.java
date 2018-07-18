package ksvp;

import java.util.Scanner;

public class Stringpalidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s;
  Scanner scan= new Scanner(System.in);
  s = scan.nextLine();
StringBuilder sb=new StringBuilder(s);
StringBuilder p=sb.reverse();
if(s.equals(String.valueOf(p))){
	System.out.println("yes");
}else{
	System.out.println("no");
}
	}

}
