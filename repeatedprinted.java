package ksvp;
import java.util.Scanner;
public class repeatedprinted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a,i,j;
  Scanner scan= new Scanner(System.in);
  a= scan.nextInt();
   int n[]=new int[a];
   for(i=0;i<a;i++){
	   n[i]=scan.nextInt();
   } for(i=0;i<a;i++){
	   for(j=i+1;j<a;j++){
		  if(n[i]==n[j]){
			  System.out.println(n[i]);
		  }
	   }}
	}}


