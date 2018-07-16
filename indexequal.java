package ksvp;
import java.util.Scanner;
public class indexequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a,i,j;
   Scanner ss = new Scanner(System.in);
   a = ss.nextInt();
   int arr[]= new int[a];
   for(i=0;i<a;i++){
	   arr[i]=ss.nextInt();
   }
   for(i=0;i<a;i++){
     if(i==arr[i]){
    	 System.out.print(i+" ");
     }
   }
	}

}
