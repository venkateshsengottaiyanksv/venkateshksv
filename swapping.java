package ksvp;
import java.util.Scanner;
public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner ss = new Scanner(System .in);
 int a=ss.nextInt();
 int b=ss.nextInt();
 a=a+b;
 b=a-b;
 a=a-b;
 System.out.println(a+" "+b);
	}

}
