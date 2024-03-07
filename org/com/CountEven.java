package org.com;

import java.util.Scanner;

public class CountEven {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number to count the factor of Even no. ");
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		if (n%i==0) {
		}else if (i%2==0) { 
			
			System.out.println(i);
		}
	}
}
}
