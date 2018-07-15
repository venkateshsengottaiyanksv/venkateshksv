package ksvp;
import java.util.Scanner;
public class romantointeger {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s;
     Scanner scan=new Scanner(System.in);
     s=scan.nextLine().toUpperCase();
     int a[]=new int[s.length()],d=0;
     for(int i=0;i<s.length();i++){
    	 char c=s.charAt(i);
    	 switch(c){
    		 case 'X':{
    			 a[i]=10;
    			 break;
    		 }
    		 case 'I':{
    			 a[i]=1;
    			 break;
    		 }
    		 case 'V':{
    			 a[i]=5;
    			 break;
    		 }
    		 case 'L':{
    			 a[i]=50;
    			 break;
    		 }
    		 case 'C':{
    			 a[i]=100;
    			 break;
    		 }
    		 case 'D':{
    			 a[i]=500;
    			 break;
    		 }
    		 case 'M':{
    			 a[i]=1000;
    			 break;
    		 }
    	 }
     }
     d=a[a.length-1];
    for(int i=a.length-1;i>0;i--){
    	if(a[i]>a[i-1]) d=d-a[i-1];
    	else d=d+a[i-1];
    }
    System.out.println(d);
     
	}

}
