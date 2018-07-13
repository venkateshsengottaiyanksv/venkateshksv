package ksvp;

import java.util.Scanner;

public class intervalprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,i,a=0,b;
		   Scanner scan = new Scanner(System.in);
		   n = scan.nextInt();
		   b = scan.nextInt();
		   for(int j=n;j<b;j++){
		   for(i=2;i<j;i++)
		   {
				   if(j%i==0){
					   break;
				   }
		   }if(i==j){
				   System.out.println(j);
			   }
		   }
	}
	}