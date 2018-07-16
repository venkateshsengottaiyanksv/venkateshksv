package ksvp;
import java.util.Scanner;
public class largernumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a,i,j,max=0;
    Scanner scan = new Scanner (System.in);
    a = scan.nextInt();
    int arr[]= new int[a];
    for(i=0;i<a;i++){
    	arr[i]=scan.nextInt();
    }for(i=0;i<a;i++){
    	for( j=i+1;j<a;j++){
    		if(arr[i]<arr[j]){
    			int c=arr[i];
    			arr[i]=arr[j];
    			arr[j]=c;
    		}
    	}
    			System.out.print(arr[i]);
    	}
	}
}
