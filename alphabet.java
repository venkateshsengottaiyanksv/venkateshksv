package ksv;

import java.util.Scanner;

public class alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		Scanner scan = new Scanner(System.in);
		c=scan.next().charAt(0);
		if(c=='a'&&c=='z'&&c=='A'&&c=='Z'){
			System.out.println("alphabet");
		}
		else
		{
			System.out.println("no");
		}

	}

}
