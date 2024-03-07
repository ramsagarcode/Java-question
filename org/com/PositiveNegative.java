package org.com;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number;
		number=sc.nextInt();
		if(number >0){
			System.out.println(number +" :number is +ve ");
		}
		
		else {
			System.out.println(number + ": number is -ve");
		}
		
	}
}
