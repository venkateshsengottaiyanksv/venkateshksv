package ksv;

import java.util.Scanner;

public class primenum {
public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n,i,a=0;
   Scanner scan = new Scanner(System.in);
   n = scan.nextInt();
   for(i=1;i<=n;i++)
	   {
		   if(n%i==0){
			   a++;
		   }
	   }if(a==2){
	   System.out.println("prime");
   }else{
	   System.out.println("noprime");
   }
	
}}

