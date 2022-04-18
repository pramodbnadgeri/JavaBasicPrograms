package com.ty;



public class AsciiSum {

	public static void main(String[] args) {
		String name = "apple";
		int sum=0;
		for (int i = 0; i <= name.length() - 1; i++) {
			int ascii = name.charAt(i);
			sum=sum+ascii;
			
		}
		System.out.println(sum);
	}

}
