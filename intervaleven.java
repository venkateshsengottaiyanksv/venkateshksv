package ksvp;

import java.util.Scanner;

public class intervaleven {
	 public static void main(String[] args) {
	      int n,a,i;
	      Scanner scan = new Scanner(System .in);
	      n = scan.nextInt();
	      a = scan.nextInt();
	      for(i=n;i<a;i++){
	        if(i%2==0){	  
	    	  System.out.println(i);
	      }}
	  }
}
