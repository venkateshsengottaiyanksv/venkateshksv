package ksvp;
import java.util.Scanner;
public class removespace {
     public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan = new Scanner(System.in);
  String s = scan . nextLine();
  String a = s.replaceAll(" ","");
  System.out.println(a);
	}

}
