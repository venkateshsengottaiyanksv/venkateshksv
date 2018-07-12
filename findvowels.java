package ksv;

import java.util.Scanner;

public class findvowels {

public static void main(String[] args) {
		// TODO Auto-generated method stub
  char ch ;
  Scanner ss =new Scanner (System.in);
  ch = ss.next().charAt(0);
  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	  System.out.println("alphabet");
	  }
  else
  {
		  System.out.println("constant");
	  }
  }

}
