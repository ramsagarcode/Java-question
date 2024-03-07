package org.com;

import java.util.Scanner;

public class OddNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter  the number ");
	int i;
	i=sc.nextInt();
	while(i>=55)
	{
		if(i%2!=0) {
		System.out.println(i);
		}
		i--;
	}
}
}
