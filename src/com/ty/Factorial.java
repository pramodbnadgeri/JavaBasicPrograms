package com.ty;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number to which factorial is needed");
		int num = scanner.nextInt();
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
