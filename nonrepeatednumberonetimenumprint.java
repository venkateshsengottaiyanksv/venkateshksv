package ksvp;
import java.util.Scanner;
public class nonrepeatednumberonetimenumprint {
   public static void main(String[] args) {
 int a,i,j,k=0,cnt=0,count=0;
 String b="";
 Scanner ss= new Scanner(System.in);
 a = ss. nextInt();
 int arr[]=new int[a];
 for(i=0;i<a;i++){
	 arr[i]=ss.nextInt(); }
 for(i=0;i<a;i++){
	 for(j=i+1;j<a;j++){
		 cnt=0;
	 if(arr[i]==arr[j]){
		 cnt++;
		 for(k=j;k<a-1;k++) 
			 arr[k]=arr[k+1];
		 a--;
		 j--; } }
	 if(cnt==0){
		  System.out.println(arr[i]);}
   }}}


