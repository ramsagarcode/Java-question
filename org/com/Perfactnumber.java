package org.com;

import java.util.Scanner;

public class Perfactnumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number :-");
	int sum=0;
	int n=sc.nextInt();
	for(int i=1;i<n;i++) {
		if(n % i== 0) 
			sum=sum+i;
	}
		if(sum==n) 
		{
			System.out.println(n+ " :no is perfect" );
		}
		else 
			System.out.println(n+ " :no is not a perfect");
		}
	}


