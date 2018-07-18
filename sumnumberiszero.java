package ksvp;
import java.util.Scanner;

public class sumnumberiszero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a,i,j;
    Scanner scan= new Scanner(System.in);
    a = scan.nextInt();
    int arr[]=new int[a];
    for(i=0;i<a;i++){
    	arr[i]=scan.nextInt();
    }
    for(i=0;i<a;i++){
    	for(j=i+1;j<a;j++){
    	if(arr[i]+arr[j]==0){
    		System.out.println(arr[i]+" "+arr[j]);
    	}
    	}
    }
	}

}
