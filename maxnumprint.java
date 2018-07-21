package ksvp;
import java.util.Scanner;
public class maxnumprint {
  public static void main(String[] args){
	  int a,max;
	  Scanner ss = new Scanner (System.in);
	  a = ss.nextInt();
	  int arr[] = new int[a];
	  for(int i=0;i<a;i++){
		arr[i]=ss.nextInt();}
	  max=arr[0];
	  for(int i=0;i<a;i++){
			if(max<arr[i]){
			max=arr[i];
			}	  }
		System.out.println(max);
		}
			
 }

