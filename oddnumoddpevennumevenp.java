package ksvp;
import java.util.Scanner;
public class oddnumoddpevennumevenp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a,i;
   Scanner ss = new Scanner (System.in);
   a = ss.nextInt();
   int arr[] = new int[a];
   for(i=0;i<a;i++){
	   arr[i]=ss.nextInt();
   
   if(i%2==0){if(arr[i]%2==1){System.out.println(arr[i]+" ");}}
	 if(i%2==1) {if(arr[i]%2==0){System.out.println(arr[i]+" ");}}
	   
	}}}
	


