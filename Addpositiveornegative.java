package ksvp;
import java.util.Scanner;
public class Addpositiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n,b=0;
  Scanner scan = new Scanner(System.in);
  n = scan.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
	  arr[i]=scan.nextInt();
  }for(int i=0;i<n;i++){
  b=b+arr[i];
	  }System.out.println(b);
	}}


