package com.ty;

public class ReverseString {
	public static void main(String[] args) {
		String name = "malayalam";
		String name1 = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			name1 = name1 + name.charAt(i);
		}
	
				if (name1.equals(name)) {
			System.out.println("palindrome");
			return;
		}
		else
		System.out.println("not palindrome");
	}
}