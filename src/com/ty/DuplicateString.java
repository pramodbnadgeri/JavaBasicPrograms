package com.ty;

import java.util.HashSet;

public class DuplicateString {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		String arr[] = { "an", "ball", "x", "an", "an", "ball", "c" };
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					hs.add(arr[i]);

				}
			}
		}
		System.out.println(hs);
	}
}
