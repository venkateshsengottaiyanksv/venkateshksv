package ksv;

import java.util.Scanner;

public class leapyr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int yr;
      Scanner scan=new Scanner(System.in);
       yr= scan.nextInt();
      if(yr%4==0){
    	  System.out.println("a leap year");
      }
      else{
    	  System.out.println("a not leap year");
      }
	}

}
