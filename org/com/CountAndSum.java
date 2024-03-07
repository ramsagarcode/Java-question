package org.com;

import java.util.Scanner;

public class CountAndSum {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number to count and sum ");
	int n,sum=0;
	n=sc.nextInt();
	
	for(int i=1; i<=n;i++) {
		
		sum= sum+i;
	}
		System.out.println(sum);
	}
}

