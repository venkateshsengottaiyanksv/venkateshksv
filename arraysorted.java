package ksvp;
import java.util.Arrays;
import java.util.Scanner;
public class arraysorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a,i;
   Scanner ss = new Scanner (System.in);
   a = ss.nextInt();
   int arr[] = new int [a];
   for(i=0;i<a;i++){
	   arr[i] = ss.nextInt();
   }
     Arrays.sort(arr);
     for(i=0;i<a;i++){
     System.out.println(arr[i]);
	}

}}
