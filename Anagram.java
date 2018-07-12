package ksv;
import java.util.Scanner;
public class Anagram{
public static void main(String[] args){
    String str1, str2;
        int l, l1, l2, i, j,c=0,c1=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First String : ");
        str1 = scan.nextLine();
        System.out.print("Enter Second String : ");
        str2 = scan.nextLine();
        l1 = str1.length();
        l2 = str2.length();
		if(l1 == l2){
        l = l1;
            for(i=0; i<l; i++){
             c= 0;
                for(j=0; j<l; j++){
                if(str1.charAt(i) == str2.charAt(j)){
                c= 1;break;}}
                    if(c== 0){
         c1= 1;break;}}
                 if(c1== 1){
        System.out.print("Strings are not Anagram");
    } else{
   System.out.print("Strings are Anagram");}}
}}
    
