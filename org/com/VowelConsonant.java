package org.com;

import java.util.Scanner;

public class VowelConsonant {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the alphabets");
	char ch=sc.next().charAt(0);
	if(ch=='a'|| ch=='e'|| ch=='o'|| ch=='u' || ch=='i')
		System.out.println(ch+" :is a vowel");
	else {
		System.out.println(ch+" is a consonant");
	}
	
}
}
