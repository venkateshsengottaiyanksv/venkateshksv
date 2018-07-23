package ksvp;
import java.util.Scanner;
public class reverselist{
	public static void main(String[]args){
  int  a,i,b=0;
  String h="";
  Scanner scan = new  Scanner(System.in);
  a = scan.nextInt();
  int  s1[] = new int[a];
  for(i=0;i<a;i++){
	  s1[i]=scan.nextInt();}
	for(i=s1.length-1;i>=0;i--){
	 System.out.print(h+s1[i]);
	 h="->";}
 
	 
  }}
	
	