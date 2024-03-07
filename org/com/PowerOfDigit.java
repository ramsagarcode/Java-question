package org.com;

import java.util.Scanner;

public class PowerOfDigit {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the base ");
	int m;
	System.out.println("Enter the exponent");
	int n;
	m=sc.nextInt();
	n=sc.nextInt();

	int result=1;
	for(int i=0; i<n; i++) {
		result= result*m;
		
	}
	System.out.println("result: " +result);
	
}
}
