package com.ty;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		int temp = num;
		while (temp != 0) {
			int rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp / 10;
		}
		System.out.println("original number is "+num);
		System.out.println("reverse number is "+sum);
	}
}
