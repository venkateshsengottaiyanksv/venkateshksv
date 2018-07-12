package ksv;
import java.util.Scanner;
public class findvowels {
public static void main(String[] args) {
  char ch ;
  Scanner ss =new Scanner (System.in);
  ch = ss.next().charAt(0);
  if(ch>=65&&ch<=90||ch>=97&&ch<=122){
  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')   
	  System.out.println("vowels");
  else  
	  System.out.println("consonant");
  }
  else  System.out.println("invalid");
  }
}