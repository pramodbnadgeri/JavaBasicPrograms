package com.ty;

public class ReverseOfAnArray {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40 };
		for (int i = 0; i <= a.length/2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
