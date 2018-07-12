package ksv;
import java.util.Scanner;
public class largestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n,i,max;
  Scanner ss = new Scanner(System.in);
  n = ss.nextInt();
  int a[]=new int[n];
  for(i=0;i<n;i++){
	  a[i]=ss.nextInt();}
  max=a[0];
	for(i=0;i<n;i++){
		if(max<a[i]){
		max=a[i];
		}	  }
	System.out.println(max);
	}

}
