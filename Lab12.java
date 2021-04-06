package com.xuou.Lab12;

public class Lab12 {
	public static void main(String[] args) {
		String one = "You and Me";
		String two = " you and me ";
		System.out.println(one.equals(two));
		System.out.println(one.contains(two));
		System.out.println(one.length());
		System.out.println(two.length());
		System.out.println(one.substring(1, 4));
		System.out.println(two.substring(1, 4));
		System.out.println(two.trim());
		System.out.println(one.trim());
		System.out.println(one.toUpperCase());
		System.out.println(two.toUpperCase());
		System.out.println(two.toUpperCase().trim());
	}
}
