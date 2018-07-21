package ksvp;
import java.util.Scanner;
public class minnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a,i,j,min;
    Scanner scan = new Scanner (System.in);
    a = scan.nextInt();
    int arr[] = new  int[a];
    for(i=0;i<a;i++){
    	arr[i] = scan.nextInt();
    } min =arr[0];
    for(i=0;i<a;i++){
    		if(min>arr[i]){
    		min=arr[i];
    		}}System.out.println(min);
    	
    }
	}


