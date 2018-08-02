package ksvp;
import java.util.Scanner;
public class numericstring {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner scan = new Scanner(System.in);
    	int count =0;
    	String s = scan.nextLine();
    	for(int i=0;i<s.length();i++){
    		if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
    			count++;
    			
    		}
    	}System.out.println(count);

	}

}
