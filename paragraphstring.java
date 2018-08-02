package ksvp;
import java.util.Scanner;
public class paragraphstring {
     public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan = new Scanner(System .in);
  int count = 0;
  String s = scan .nextLine();
  String s1[] = s.replaceAll(" ","").replace("."," ").split(" ");
      System.out.println(s1.length);
	}

}
