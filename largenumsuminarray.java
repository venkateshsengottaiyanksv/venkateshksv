package ksvp;
import java.util.Scanner;
public class largenumsuminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System .in);
		int a = scan .nextInt(),b=1,k;
		int arr[] = new int [a];
		for(int i=0; i<a; i++){
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<a; i++){
			if(arr[i]<0){
			 for( k=i+1;k<a;k++){
				 if(arr[k]<0) break;
			 }
			 if(k==a){
				 System.out.println(b);
				 return;
			 }
				
			}
			b=b*arr[i];
		}
		
		System.out.println(b);
		
		
		
	}

}
