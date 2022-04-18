package com.ty;

public class DuplicateArray {
	public static void main(String[] args) {
		int s1[] = { 1, 2, 3, 74, 1, 2, 5 };
		for (int i = 0; i < s1.length; i++) {
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i] == s1[j]) {
					System.out.println(s1[j]);
				}
			}
		}

	}
}
