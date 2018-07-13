package ksv;
import java.util.Scanner;
public class sumofintegrenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,i,b=0,s;
    Scanner scan = new Scanner (System .in);
    n = scan.nextInt();
    s = scan.nextInt();
    int a[] = new int[n];
    for(i=0;i<n;i++){
    	a[i]=scan.nextInt();
    }for(i=0;i<s;i++){
    	b=b+a[i];
    }System.out.println(b);
    
    }
	}


